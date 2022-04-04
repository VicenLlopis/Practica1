public class Persona {
   private String nombre;
   private int edad;
   private String poblacion;

   public Persona(String nombre,int edad){
      this.nombre = nombre;
      this.edad = edad;	
   }
	
   public Persona() {
      this.nombre=null;	  
   }
	 
   public void setNombre(String nom){
      nombre = nom;
   }
    public void setPoblacion(String poblacion){
      poblacion = poblacion;
   }

   public void setEdad(int ed){
      edad = ed;
   }

   public String getNombre(){
      return nombre;
   }
   
   public int getEdad(){
      return edad;
   }

   public string getPoblacion(){
   return poblacion;

}//fin Persona
