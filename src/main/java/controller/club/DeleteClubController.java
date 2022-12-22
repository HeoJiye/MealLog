package controller.club;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;
import model.service.ClubManager;

public class DeleteClubController implements Controller {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		long clubId = (long) request.getAttribute("clubId");
		ClubManager manager = ClubManager.getInstance();
				
		manager.remove(clubId);
		
		return "redirect:/group";
	}
}
