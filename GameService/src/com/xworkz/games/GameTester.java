package com.xworkz.games;
import com.xworkz.games.dto.GameDTO;
import com.xworkz.games.service.GameService;
import com.xworkz.games.service.GameServiceImpl;
public class GameTester {

	public static void main(String[] args) {
	

		GameDTO dto = new GameDTO("Ludo", "24", "Empty", 10, 2, false);

        GameService gameservice = new GameServiceImpl();
		 String saved = gameservice.validateAndSave1(dto);
		 System.out.println(saved);

	}


	
}
