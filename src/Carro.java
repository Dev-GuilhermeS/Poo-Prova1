public class Carro {
    private String modelo;
    private String cor;
    private int ano;
    private boolean verificar;

   //construtor 
    public Carro (String modelo, String cor, int ano){
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    //metodos
    public void ligar(){
   this.verificar = true;
   verificarIgnição();
    }
    public void desligar(){
   this.verificar = false;
   verificarIgnição();    
    }
    private void verificarIgnição(){
   if (this.verificar = true)
   System.out.println("Carro ligado");
   {
  System.out.println("Carro desligado");
   }      
    }
    
   //get
    public String getModelo(){
        return this.modelo;
    }
    public String getCor(){
        return this.cor;
    }
    public int getAno(){
        return this.ano;
    }
    
//set
    public void setModelo(String modelo){
         this.modelo = modelo;
    }
    public void setCor(String cor){
         this.cor = cor;
    }
    public void setAno(int ano){
         this.ano = ano;
    }









}
