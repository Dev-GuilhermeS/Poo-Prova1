public class Segurança {
    private boolean cinto;
    private boolean portas;
    private boolean farois;
    
   //construtor 
    public Segurança (boolean cinto, boolean portas, boolean farois){
        this.cinto = cinto;
        this.portas = portas;
        this.farois = farois;
    }

    //metodos
    public void ligar(){
    farois = true;
    System.out.println("Farois Ligados");
    }
    public void desligar(){
    farois = false;
    System.out.println("Farois Desligados");
    }
    private void Verificar(){
    cinto = true;
    System.out.println("Cintos Colocados");
    }
    public void Abrir(){
    portas = true;
    System.out.println("Portas Abertas"); 
    Verificar(); 
    }
    public void Fechar(){
    portas = false;
    System.out.println("Portas Fechadas");  
    }

   //get
    public boolean getCinto(){
        return this.cinto;
    }
    public boolean getPortas(){
        return this.portas;
    }
    public boolean getFarois(){
        return this.farois;
    }
    
//set
    public void setCinto(boolean cinto){
         this.cinto = cinto;
    }
    public void setPortas(boolean portas){
         this.portas = portas;
    }
    public void setFarois(boolean farois){
         this.farois = farois;
    }








   
}
