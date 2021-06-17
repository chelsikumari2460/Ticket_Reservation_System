package com.reservation.demo.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@Autowired
	TrainRepository trainRepo;
	
	@Autowired
     UserRepository userRepo;
	@Autowired
    StationRepository stnRepo;
	@Autowired
    TicketRepository tRepo;
	
	@GetMapping("/")
    public String viewHomePage() {
        return "home.jsp";
    }
    @PostMapping("/register")
    @ResponseBody
    public List<Object[]> register(User user) {
    	System.out.println(user+"-----------------------------------------");
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String encodedPassword = passwordEncoder.encode(user.getPassword());
//        user.setPassword(encodedPassword);
         
        userRepo.save(user);
        //return (userRepo.findByName());
        return tRepo.methodThatQueriesMultipleTables();
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
		System.out.println(trainRepo.findAll().toString());
		return "trainEntry.jsp";
	}
	@PostMapping("/sentry")
	@ResponseBody
	public String addstation(Station stn) {
		stnRepo.save(stn);
		System.out.println(stn);
		return (stnRepo.findAll().toString());
		
	}
	@GetMapping("/ticket")
	public String geticket() {
		//System.out.println(stnrepo.findAll().toString());
		return "ticketEntry.jsp";
	}
	@PostMapping("/addticket")
	@ResponseBody
	public List<Ticket> addticket(Ticket ticket) {
		tRepo.save(ticket);
		System.out.println(ticket);
		return (tRepo.findAll());
		
	}
	@GetMapping("/station")
	public String getstation() {
		//System.out.println(stnrepo.findAll().toString());
		return "stationEntry.jsp";
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
	public Train bookticket(@RequestBody Hello h){
		try {
			System.out.println(h.getTrain_no()+"  "+h.getUser_id());
			Ticket t1=new Ticket();
			Train tr=trainRepo.findByTrain_no(h.getTrain_no());
			User user=userRepo.findByUserId(h.getUser_id());
			System.out.println(tr+" "+user  );
			t1.setPrice(250.05f);
			t1.setTrainobj(tr);
			t1.setUser(user);
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
		public void viewticket(@RequestBody Long userid){
			
			//
			//Long userid=2L;
			List <Ticket> t=tRepo.allticketUserId(userid);
			//Ticket t=tRepo.findById(1).orElse(null);
			//System.out.println(t.getUser().getUserid());
			System.out.println(t);
			//return null;
	}
	
	
}
