package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Livro livro = new Livro("Livro", 300);
        System.out.println(gato);
        System.out.println(livro);
        /*int a = 5;
        int b = 3;
        System.out.println("Hello World!");
        System.out.println(a + " + " + b + " = " + (a + b));*/

    }

}
    class Livro{

        private String nome;
        private Integer numeroPaginas;

        public Livro() {
        }

        public Livro(String nome, Integer numeroPaginas) {
            this.nome = nome;
            this.numeroPaginas = numeroPaginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumeroPaginas() {
            return numeroPaginas;
        }

        public void setNumeroPaginas(Integer numeroPaginas) {
            this.numeroPaginas = numeroPaginas;
        }

        @Override
        public String toString() {
            return "livro{" +
                    "nome='" + nome + '\'' +
                    ", numeroPaginas=" + numeroPaginas +
                    '}';
        }
    }
