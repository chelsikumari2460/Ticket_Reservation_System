package com.reservation.demo.model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@Autowired
	TrainRepository trainRepo;
	
	@Autowired
     UserRepository userRepo;
	@Autowired
    TicketRepository tRepo;
	
	@GetMapping("/")
    public String viewHomePage() {
        return "home.jsp";
    }
    @PostMapping("/register")
    @ResponseBody
    public List<User> register(User user) {
    	System.out.println(user+"-----------------------------------------");   
        userRepo.save(user);
        return (userRepo.findAll());
    }
	@PostMapping("/addtrains")
	@ResponseBody
	public String addtrain(Train train) {
		trainRepo.save(train);
		System.out.println(train);
		return (trainRepo.findAll().toString());
		
	}
	@GetMapping("/train")
	public String getTrain() {
		//System.out.println(trainRepo.findAll().toString());
		return "trainEntry.jsp";
	}
	@PostMapping("/searchTrainResults")
	@ResponseBody
	public List<Object[]> search(String src,String dest) {
		System.out.println(src+"-----"+dest);
		return (trainRepo.searchTrain(src,dest));
		
	}
	@GetMapping("/searchTrain")
	public String search() {
		//System.out.println(stnrepo.findAll().toString());
		return "TicketBooking.jsp";
	}
	
	@RequestMapping (value = "/bookticket", method = RequestMethod.POST)
	@ResponseBody
	public Train bookticket(@RequestBody BookTicket h){
		try {
			//System.out.println(h.getTrain_no()+"  "+h.getUser_id());
			Ticket t1=new Ticket();
			Train tr=trainRepo.findByTrain_no(h.getTrain_no());
			User user=userRepo.findByUserId(h.getUser_id());
			//System.out.println(tr+" "+user  );
			t1.setPrice(250.05f);
			t1.setTrainobj(tr);
			t1.setUser(user);
			t1.setAge(h.getAge());
			t1.setGender(h.getGender());
			t1.setName(h.getName());
			tRepo.save(t1);
			
			System.out.println (tRepo.findAll());
			return null;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
		@RequestMapping (value = "/viewAllticket", method = RequestMethod.POST)
		@ResponseBody
		public void viewticket(@RequestBody View h){
			System.out.println(h);
			//all ticket of user
			if(h.getTrain_no()==null) {
				System.out.println(tRepo.allticketUserId(h.getUser_id()));
			}
			
			else {
				System.out.println(tRepo.allticket(h.getUser_id(),h.getTrain_no()));
			}
		}
		@RequestMapping (value = "/cancelticket", method = RequestMethod.POST)
		@ResponseBody
		public void cancelticket(@RequestBody CancelTicket h){
			System.out.println(h);
			System.out.println(tRepo.cancelticket(h.getId()));
		}
			
	
}
