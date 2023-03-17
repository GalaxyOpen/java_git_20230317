package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientRepository {
	private static ClientRepository repository = new ClientRepository();
	private ClientRepository() {}
	public static ClientRepository getInstance() {
		return repository;
	}
	
	Map<String, ClientDTO> clientmap = new HashMap<>();
	List<BreakdownDTO> bList = new ArrayList<>();
	
	public boolean save(ClientDTO clientDTO) {
		
		ClientDTO result = clientmap.put(clientDTO.getId(), clientDTO);
		if (result == null) {
		return true ;
		}else {
			return false;
		}
	}
	public boolean loginCheck(String id, String password) {
		for(String key : clientmap.keySet()) {
			if(clientmap.get(key).getId().equals(id) && clientmap.get(key).getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	public Map<String, ClientDTO> findAll(){
		return clientmap;
	}
	public ClientDTO findById(String id, String password) {
		for(String key : clientmap.keySet()) {
			if(clientmap.get(key).getId().equals(id) && clientmap.get(key).getPassword().equals(password)) {
				return clientmap.get(key);
			}
		}
		return null;
	}
			
	public List<BreakdownDTO> breakList(String account){
		List<BreakdownDTO> list = new ArrayList<>();
		for(BreakdownDTO b : bList) {
			if(b.getAccount().equals(account)) {
				list.add(b);
			}
		}
		return list;
	}
	
	public String getAccount(String id, String password) {
		for(String key:clientmap.keySet()) {
			if(clientmap.get(key).getId().equals(id) && clientmap.get(key).getPassword().equals(password)) {
				return clientmap.get(key).getAccount();
			}
		}
		return null;
	}
	
	public boolean deposit(String account, long money) {
		for(String key:clientmap.keySet()) {
			if(clientmap.get(key).getAccount().equals(account)) {
				clientmap.get(key).setBalance(clientmap.get(key).getBalance()+money);
				BreakdownDTO breakdownDTO = new BreakdownDTO();
				breakdownDTO.setAccount(account);
				breakdownDTO.setDivision("입금");
				breakdownDTO.setDealMoney(money);
				breakdownDTO.setTotalMoney(clientmap.get(key).getBalance());
				bList.add(breakdownDTO);
				return true;
			}
		}
		return false;
	}
	public boolean withdraw(String account, long money) {
		for(String key:clientmap.keySet()) {
			if(clientmap.get(key).getAccount().equals(account)) {
				if(clientmap.get(key).getBalance() >= money) {
					clientmap.get(key).setBalance(clientmap.get(key).getBalance()-money);
					BreakdownDTO breakdownDTO = new BreakdownDTO();
					breakdownDTO.setAccount(account);
					breakdownDTO.setDivision("출금");
					breakdownDTO.setDealMoney(money);
					breakdownDTO.setTotalMoney(clientmap.get(key).getBalance());
					bList.add(breakdownDTO);
					return true;
				}else {
					return false;
				}
			}
		}
		return false;
	}
	public boolean transferCheck(String transferAccount) {
		for(String key : clientmap.keySet()) {
			if(clientmap.get(key).getAccount().equals(transferAccount)) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean update(String id, String password, String updatePassword) {
		for(String key : clientmap.keySet()) {
			if(clientmap.get(key).getId().equals(id) && clientmap.get(key).getPassword().equals(password)) {
				clientmap.get(key).setPassword(updatePassword);
				return true;
			}
		}
		return false;
	}
	public boolean delete(String id, String password) {
		for(String key : clientmap.keySet()) {
			if(clientmap.get(key).getId().equals(id) && clientmap.get(key).getPassword().equals(password)) {
				clientmap.remove(key);
				return true;
			}
		}
		return false;
	}
}














