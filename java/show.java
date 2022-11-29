class showS1 extends bus implements bus1{
	int booked;
	
	void reset(){
		booked=0;
	}
	
	boolean bookNew(int num){
		if(booked+num>capacity){
			return false;
		}
		else{
			booked+=num;
			return true;
		}
	}
	
	showS1 (String Mj, int Mbno, int Mduration, int Mseat){
		jname = Mj;
		busno = Mbno;
		duration = Mduration;
		seats = Mseat;
	}
}

class showS2 extends bus implements bus2{
	int booked;
	
	void reset(){
		booked=0;
	}
	
	boolean bookNew(int num){
		if(booked+num>capacity){
			return false;
		}
		else{
			booked+=num;
			return true;
		}
	}
	
	showS2 (String Mj, int Mbno, int Mduration, int Mseat){
		jname = Mj;
		busno = Mbno;
		duration = Mduration;
		seats = Mseat;
	}
}

class showS3 extends bus implements bus3{
	int booked;
	
	void reset(){
		booked=0;
	}
	
	boolean bookNew(int num){
		if(booked+num>capacity){
			return false;
		}
		else{
			booked+=num;
			return true;
		}
	}
	
	showS3 (String Mj, int Mbno, int Mduration, int Mseat){
		jname = Mj;
		busno = Mbno;
		duration = Mduration;
		seats = Mseat;
	}
}

class showS4 extends bus implements bus4{
	int booked;
	
	void reset(){
		booked=0;
	}
	
	boolean bookNew(int num){
		if(booked+num>capacity){
			return false;
		}
		else{
			booked+=num;
			return true;
		}
	}
	
	showS4 (String Mj, int Mbno, int Mduration, int Mseat){
		jname = Mj;
		busno = Mbno;
		duration = Mduration;
		seats = Mseat;
	}
}

class showS5 extends bus implements bus5{
	int booked;
	
	void reset(){
		booked=0;
	}
	
	boolean bookNew(int num){
		if(booked+num>capacity){
			return false;
		}
		else{
			booked+=num;
			return true;
		}
	}
	
	showS5 (String Mj, int Mbno, int Mduration, int Mseat){
		jname = Mj;
		busno = Mbno;
		duration = Mduration;
		seats = Mseat;
	}
}