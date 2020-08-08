package com.dxctraining.ui;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.dxctraining.CsTrainee;
import com.dxctraining.EceTrainee;
import com.dxctraining.Trainee;

public class TraineeMain {
	Map<Integer,Trainee> store=new HashMap<>();
	Set<Trainee> ctrainee=new HashSet<>();
	Set<Trainee> etrainee=new HashSet<>();
	public static void main(String args[])
	{
		TraineeMain tm=new TraineeMain();
		tm.runApp();
	}
	void runApp()
	{
		Trainee trainee1=new CsTrainee(659,"dharma",2);
		Trainee trainee2=new CsTrainee(660,"surya",1);
		Trainee trainee3=new EceTrainee(661,"rama","spectroscope");
		Trainee trainee4=new EceTrainee(662,"krishna","multimeter");
		store.put(659, trainee1);
		store.put(660, trainee2);
		store.put(661, trainee3);
		store.put(662, trainee4);
		
		Set<Integer> keys = store.keySet();
		for (Integer k : keys) {
			Trainee fetched = store.get(k);
			if(fetched instanceof EceTrainee)
			{
				EceTrainee ecetrainee=(EceTrainee)fetched;
				etrainee.add(ecetrainee);
				displayEce();
			}
			if(fetched instanceof CsTrainee)
			{
				CsTrainee cstrainee=(CsTrainee)fetched;
				ctrainee.add(cstrainee);
				displayCs();
			}
			public void displayEce() {
				for(Trainee t:etrainee)
				{
					System.out.println("id "+etrainee.getId()+"name "+etrainee.getName+"device used"+etrainee.getDeviceUsed());
				}
				
			}
			
			public void displayCs()
			{
				for(Trainee t:ctrainee)
				{
					System.out.println("id "+ctrainee.getId()+"name "+ctrainee.getName+"device used"+ctrainee.getLanguages());
				}
			}
			
		
	}

}
	
}

