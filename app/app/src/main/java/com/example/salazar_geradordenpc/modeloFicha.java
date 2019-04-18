package com.example.salazar_geradordenpc;



public class modeloFicha
{
    private int Codigo;
    private String Nome;
    private String Raça;
    private String Genero;
    private String Aperencia;
    private String Habilidade;
    private String Dom;
    private String Traço;
    private String Maneiro;
    private String Ideal;
    private String Vinculo;
    private String Segredo;

        public modeloFicha()
        {

        }
        // Update
        public modeloFicha(int _Codigo,String _Nome,String _Raça, String _Genero,String _Aparencia, String _Habilidade, String _Dom, String _Traço, String _Maneiro, String _Ideal, String _Vinculo, String _Segredo)
        {
            this.Codigo = _Codigo;
            this.Nome = _Nome;
            this.Raça = _Raça;
            this.Genero = _Genero;
            this.Aperencia = _Aparencia;
            this.Habilidade = _Habilidade;
            this.Dom = _Dom;
            this.Traço = _Traço;
            this.Maneiro = _Maneiro;
            this.Ideal = _Ideal;
            this.Vinculo = _Vinculo;
            this.Segredo = _Segredo;

        }
        //Insert
        public modeloFicha(String _Nome,String _Raça, String _Genero,String _Aparencia, String _Habilidade, String _Dom, String _Traço, String _Maneiro, String _Ideal, String _Vinculo, String _Segredo)
        {
            this.Nome = _Nome;
            this.Raça = _Raça;
            this.Genero = _Genero;
            this.Aperencia = _Aparencia;
            this.Habilidade = _Habilidade;
            this.Dom = _Dom;
            this.Traço = _Traço;
            this.Maneiro = _Maneiro;
            this.Ideal = _Ideal;
            this.Vinculo = _Vinculo;
            this.Segredo = _Segredo;

        }

        //=================================================================================


    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getRaça() {
        return Raça;
    }

    public void setRaça(String raça) {
        Raça = raça;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getAperencia() {
        return Aperencia;
    }

    public void setAperencia(String aperencia) {
        Aperencia = aperencia;
    }

    public String getHabilidade() {
        return Habilidade;
    }

    public void setHabilidade(String habilidade) {
        Habilidade = habilidade;
    }

    public String getDom() {
        return Dom;
    }

    public void setDom(String dom) {
        Dom = dom;
    }

    public String getTraço() {
        return Traço;
    }

    public void setTraço(String traço) {
        Traço = traço;
    }

    public String getManeiro() {
        return Maneiro;
    }

    public void setManeiro(String maneiro) {
        Maneiro = maneiro;
    }

    public String getIdeal() {
        return Ideal;
    }

    public void setIdeal(String ideal) {
        Ideal = ideal;
    }

    public String getVinculo() {
        return Vinculo;
    }

    public void setVinculo(String vinculo) {
        Vinculo = vinculo;
    }

    public String getSegredo() {
        return Segredo;
    }

    public void setSegredo(String segredo) {
        Segredo = segredo;
    }
}
