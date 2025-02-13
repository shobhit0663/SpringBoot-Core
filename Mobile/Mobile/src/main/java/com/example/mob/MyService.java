package com.example.mob;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
@Service
public class MyService {
	

		@Autowired
		private MyJpa jpa;
		
		public MobileB createM(MobileB mf) {
			this.jpa.save(mf);
			return mf;
		}
		
		public List<MobileB> showM() {
			return this.jpa.findAll();
		}
		
		public MobileB getM(Integer id) throws Exception {
			MobileB mb =  this.jpa.findById(id).orElse(null);
			if(mb==null) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This id doesn't Exist");
			}
			return mb;
		}
		
		public MobileB updateM(Integer id,MobileF mf) throws Exception {
			MobileB mb =  this.jpa.findById(id).orElse(null);
			if(mb==null) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This id doesn't Exist");
			}
			else {
				mb.setId(mf.getId());
				mb.setmName(mf.getmName());
				mb.setmBrand(mf.getmBrand());
				mb.setPrice(mf.getPrice());
				this.jpa.save(mb);
			}
				return mb;
		}
			
			void del(int id) {
				jpa.deleteById(id);
			}
				
			public Page<MobileB> showPM(int page, int size, String sortby) {
				return this.jpa.findAll(PageRequest.of(page, size, Sort.by(sortby)));
			}
			
		
	}

