package model.service;

import java.sql.SQLException;
import java.util.List;

import model.dao.FeedDAO;
import model.dto.FeedDTO;
import model.dto.FoodDTO;

public class FeedManager {
	private static FeedManager FeedMan = new FeedManager();
	private FeedDAO feedDAO;
	
	public FeedManager() {
		try {
			feedDAO = new FeedDAO();
		} catch (Exception e) {
			e.printStackTrace();
		}			
	}

	public static FeedManager getInstance() {
		return FeedMan;
	}

	//오류난 부분 일단 주석처리
	public long create(FeedDTO feed) throws SQLException {
		//feedDAO.createFood(food);
		return feedDAO.createFeed(feed);
	}

	public int remove(long feedId) throws SQLException {
		
		return feedDAO.removeFeedList(feedId);
	}		

	public List<FeedDTO> read() throws SQLException {
		List<FeedDTO> feedList = feedDAO.findFeedList();
		 
		return feedList;
	}
	
	/* 마이페이지 */
	public List<FeedDTO> readByUserId(long userId) throws SQLException {
		return feedDAO.findFeedListbyUser(userId);
	}
	
	public int countPositiveReactbyUser(long userId) throws SQLException {
		return feedDAO.countPositiveReactbyUser(userId);
	}
	
	public int countFeedbyUser(long userId) throws SQLException {
		return feedDAO.countFeedbyUser(userId);
	}
	
	public float[] findSumFoodList(long userId) throws SQLException {
		return feedDAO.findSumFoodList(userId);
	}
	
	public int countPositiveReact(long feedId) throws SQLException {
		return feedDAO.countPositiveReact(feedId);
	}
	
	public int countNegativeReact(long feedId) throws SQLException {
		return feedDAO.countNegativeReact(feedId);
	}

}