package model;


////abstact
//public class Magician extends Character  {
//
//	@Override
//	public void attack(Hero hero) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}

//
////interface
//public class Magician implements ICharacter  {
//
//	@Override
//	public void attack(Hero hero) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}


// �������� ���� Character�̱⵵�ϰ�,  ICharacter�̰�, ICharacter1�̰�, ICharacter2�̴�.
public class Magician extends Character implements ICharacter, ICharacter1, ICharacter2  {

	@Override
	public void attack2(Hero hero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack1(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Hero hero) {
		// TODO Auto-generated method stub
		
	}




	
}
