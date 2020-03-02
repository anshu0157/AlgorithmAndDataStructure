package model;

//������ ���� �߻� class, method
// new �������� ���� �� ����.
public abstract class Character extends Person {

	// abstract ��� ĳ���Ͱ� attack�̶� ���� �������Ѵ�. �� �����ϰ� ���� ��
	public abstract void attack(Hero hero);
	
}

interface ICharacter1{
	void attack1(Person person);
}

interface ICharacter2{
	void attack2(Hero hero);
}


// abstrack vs interface
