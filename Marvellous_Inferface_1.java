
import java.lang.*;


interface Circle
{
	float PI=3.14f;//public static final PI=3.14;
	
	float Calculate_Area(float radius);//public abstract float Calculate_Area(float Radius);
	
	float Calculate_Circumference(float radius);//public abstract float Calculate_Circumference(float Radius);
	
}
		
class Area implements Circle
{
	public float Calculate_Area(float radius)//concrete method
	{
		return (PI * radius *radius);
	}
	
	public float Calculate_Circumference(float radius)//concrete method
	{
		return (PI * 2 *radius);
	}
}
	
	




class Marvellous_Inferface_1
{
	public static void main(String args[])
	{
		System.out.println("Value of PI is:"+Circle.PI);//Pi is static so access using class name
		//Circle.PI=6.14f;//not allowed to chnage beacause pi is final
		float fRet=0.0f;
		Area obj=new Area();
		
		fRet=obj.Calculate_Area(10.5f);
		System.out.println("Area is :"+fRet);
		
		fRet=obj.Calculate_Circumference(10.5f);
		System.out.println("Circumference is :"+fRet);
	}
}
	