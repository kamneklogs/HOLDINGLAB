package model;
import java.util.*;

public class Holding {
    
    

	private String name;
	
	
	private ArrayList<TechnologyC> tCs;
	private ArrayList<EducationC> eCs;
	private ArrayList<VariousPC> vCs;
	private ArrayList<MedicineC> mCs;
	
	
	

	public Holding(String name) {
		
		this.name = name;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



    public ArrayList<TechnologyC> gettCs( )
    {
        return tCs;
    }



    public ArrayList<EducationC> geteCs( )
    {
        return eCs;
    }



    public ArrayList<VariousPC> getvCs( )
    {
        return vCs;
    }



    public ArrayList<MedicineC> getmCs( )
    {
        return mCs;
    }



    public void settCs( ArrayList<TechnologyC> tCs )
    {
        this.tCs = tCs;
    }



    public void seteCs( ArrayList<EducationC> eCs )
    {
        this.eCs = eCs;
    }



    public void setvCs( ArrayList<VariousPC> vCs )
    {
        this.vCs = vCs;
    }



    public void setmCs( ArrayList<MedicineC> mCs )
    {
        this.mCs = mCs;
    }
	
	
	
	
	
	
	
}
