public class Status {
    private boolean estado;
    private String perimetro;
    private String veiculo;

    // construtor
    public Status(boolean estado, String perimetro, String veiculo) {
        this.estado = estado;
        this.perimetro = perimetro;
        this.veiculo = veiculo;
    }
    
    //metodos
    public void andar(){
    estado = true;
    System.out.println("O carro está andando");
    }
    public void parar(){
    estado = false;
    System.out.println("O carro está parado");
    Estacionar();
    }
    private void Estacionar(){
    estado = false;
    System.out.println("Carro estacionado");
    }

    //get
    public boolean getEstado(){
        return this.estado;
    }
    public String getPerimetro(){
        return this.perimetro;
    }
    public String getVeiculo(){
        return this.veiculo;
    }

    //set
    public void setEstado(boolean estado){
         this.estado = estado;
    }
    public void setPerimetro(String perimetro){
         this.perimetro = perimetro;
    }
    public void setVeiculo(String veiculo){
         this.veiculo = veiculo;
    }
}
