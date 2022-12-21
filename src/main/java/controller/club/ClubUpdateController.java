package controller.club;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;
import model.dto.ClubDTO;
import model.service.ClubManager;

public class ClubUpdateController implements Controller {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		long clubId = (long) request.getAttribute("clubId");
		String cname = (String) request.getAttribute("cname");
		String goal = (String) request.getAttribute("goal");
		String info = (String) request.getAttribute("info");
		int max_member = (int) request.getAttribute("max_member");
		long leader = (long) request.getAttribute("leader");
		
		ClubManager clubManager = ClubManager.getInstance();
		ClubDTO club = new ClubDTO(clubId, cname, goal, info, max_member, leader);
		
		String hashtag = (String) request.getAttribute("hashtag");
		
		try {
			clubManager.update(club);
			
		} catch(Exception e) {
			request.setAttribute("message", e.getMessage());
		}
		
		return "redirect:/group";
	}
}
