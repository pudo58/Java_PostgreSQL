package BussinessLayer.ServiceInterface;

import java.util.List;

import BussinessLayer.BussinessEntities.Shares;

public interface ServiceShares {
	public int addToDB(Shares u);
	public int deleteToDB(String UserID,String VideoID);
	public int updateToDB(Shares u);
	public List<Shares>selectAll();
}
