
class showS1T1 extends bus implements screen1, timeslot1{
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
	
	showS1T1 (String Mtitle, String Mgenere, int Mduration, String Mdirector){
		title = Mtitle;;
		genere = Mgenere;
		duration = Mduration;
		director = Mdirector;
	}
}

class showS1T2 extends bus implements screen1, timeslot2{
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
	
	showS1T2(String Mtitle, String Mgenere, int Mduration, String Mdirector){
		title = Mtitle;;
		genere = Mgenere;
		duration = Mduration;
		director = Mdirector;
	}
}

class showS1T3 extends bus implements screen1, timeslot3{
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
	
	showS1T3(String Mtitle, String Mgenere, int Mduration, String Mdirector){
		title = Mtitle;;
		genere = Mgenere;
		duration = Mduration;
		director = Mdirector;
	}
}

class showS2T1 extends bus implements screen2, timeslot1{
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
	
	showS2T1(String Mtitle, String Mgenere, int Mduration, String Mdirector){
		title = Mtitle;;
		genere = Mgenere;
		duration = Mduration;
		director = Mdirector;
	}
}

class showS2T2 extends bus implements screen2, timeslot2{
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
	
	showS2T2(String Mtitle, String Mgenere, int Mduration, String Mdirector){
		title = Mtitle;;
		genere = Mgenere;
		duration = Mduration;
		director = Mdirector;
	}
}

class showS2T3 extends bus implements screen2, timeslot3{
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
	
	showS2T3(String Mtitle, String Mgenere, int Mduration, String Mdirector){
		title = Mtitle;;
		genere = Mgenere;
		duration = Mduration;
		director = Mdirector;
	}
}

class showS3T1 extends bus implements screen3, timeslot1{
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
	
	showS3T1(String Mtitle, String Mgenere, int Mduration, String Mdirector){
		title = Mtitle;;
		genere = Mgenere;
		duration = Mduration;
		director = Mdirector;
	}
}

class showS3T2 extends bus implements screen3, timeslot2{
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
	
	showS3T2(String Mtitle, String Mgenere, int Mduration, String Mdirector){
		title = Mtitle;
		genere = Mgenere;
		duration = Mduration;
		director = Mdirector;
	}
}

class showS3T3 extends bus implements screen3, timeslot3{
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
	
	showS3T3(String Mtitle, String Mgenere, int Mduration, String Mdirector){
		title = Mtitle;
		genere = Mgenere;
		duration = Mduration;
		director = Mdirector;
	}
}

class showS4T1 extends bus implements screen4, timeslot1{
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
	
	showS4T1 (String Mtitle, String Mgenere, int Mduration, String Mdirector){
		title = Mtitle;;
		genere = Mgenere;
		duration = Mduration;
		director = Mdirector;
	}
}

class showS4T2 extends bus implements screen4, timeslot2{
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
	
	showS4T2(String Mtitle, String Mgenere, int Mduration, String Mdirector){
		title = Mtitle;;
		genere = Mgenere;
		duration = Mduration;
		director = Mdirector;
	}
}

class showS4T3 extends bus implements screen4, timeslot3{
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
	
	showS4T3(String Mtitle, String Mgenere, int Mduration, String Mdirector){
		title = Mtitle;;
		genere = Mgenere;
		duration = Mduration;
		director = Mdirector;
	}
}

class showS5T1 extends bus implements screen5, timeslot1{
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
	
	showS5T1 (String Mtitle, String Mgenere, int Mduration, String Mdirector){
		title = Mtitle;;
		genere = Mgenere;
		duration = Mduration;
		director = Mdirector;
	}
}

class showS5T2 extends bus implements screen5, timeslot2{
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
	
	showS5T2(String Mtitle, String Mgenere, int Mduration, String Mdirector){
		title = Mtitle;;
		genere = Mgenere;
		duration = Mduration;
		director = Mdirector;
	}
}

class showS5T3 extends bus implements screen5, timeslot3{
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
	
	showS5T3(String Mtitle, String Mgenere, int Mduration, String Mdirector){
		title = Mtitle;;
		genere = Mgenere;
		duration = Mduration;
		director = Mdirector;
	}
}