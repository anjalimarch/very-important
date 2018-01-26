package lesson2;

public class SpecialForModifiers {
	
	public int anjali=44;
	public String vineeta="pochu";

	protected int amita=68;// private/nomodifier/ variable ko public method k thru outside package access kar sakte hain
	//but package jisme ye class or variable import karana padega uss package me jisme main class hai nahi to object hi create ni hoga.
	public  int getAmita() {
		return (amita);
	}
	/*public void setAmita(int amita) {
		this.amita = amita;
	}
	*/

}
//vraiable       method     access
//no modifier     //private     // cant accessed thru main class  if package is imported in main class
//no modifier     //protected    //cant accessed thru main class if package is imported   in main class 
//no modifier     //public        //can be accessed thru main class if package is imported   in main class 
//no modifier     //no modifier   //cant accessed thru main class if package is imported   in main class   

//public           //no modifier   // //cant accessed thru main class if package is imported   in main class 
//public           //private          //cant accessed thru main class if package is imported   in main class 
//public           //protected         //cant accessed thru main class if package is imported   in main class 
//public            //public            //can be accessed 

//private           //public             //can be accessed
//private            no mod              cant be accessed
//private            //private           cant be
//private            //protected         cant be 

//protected          //protected         cant be
// protected           //private           cant be
//protected           //no mod             cant be    
//protected           public 
