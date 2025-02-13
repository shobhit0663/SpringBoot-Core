package com.example.mob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/mobile")
public class MobileController {

		
		@Autowired
		private MyService ser;
		
		@PostMapping("")
		public ResponseEntity<?> createmobile(@RequestBody MobileB mf) {
			return ResponseEntity.ok(this.ser.createM(mf));
		}
		
		@GetMapping("")
		public ResponseEntity<?> showmobile(){
			return ResponseEntity.ok(this.ser.showM());
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<?> getonemobile(@PathVariable Integer id) throws Exception {
			return ResponseEntity.ok(this.ser.getM(id));
		}
		
		@PutMapping("/{id}") 
		public ResponseEntity<?> updatemobile(@PathVariable Integer id, @RequestBody MobileF mf) throws Exception {
		return ResponseEntity.ok(this.ser.updateM(id, mf));
		}
		
		@DeleteMapping("/{id}")
		void deletemobile(@PathVariable Integer id) throws Exception {
			this.ser.del(id);
		}
		
		@GetMapping("/Details")
		public ResponseEntity<?> showpagemobile(@RequestParam(defaultValue="0") int page,
												@RequestParam(defaultValue="3") int size, 
												@RequestParam(defaultValue="mName") String sortby) {
			return ResponseEntity.ok(this.ser.showPM(page, size, sortby));
		}
	}	

