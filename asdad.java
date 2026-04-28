q1

public static ArrayList<Pessoa> agrupar_geracao_X(ArrayList<Pessoa> base_de_pessoas) {
        /*
         Retorna o subconjunto das pessoas da base que pertencem � Gera��o X,
         de acordo com valores de ano m�nimo e m�ximo de nascimento definidos acima.
        */
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        for (int i = 0; i < base_de_pessoas.size(); i++) {
            Pessoa pessoa = base_de_pessoas.get(i);
            if (pessoa.nascida_entre(1965,1980)) {
                listaPessoas.add(pessoa);
            }
        }
        return listaPessoas;
    }

    public static ArrayList<Pessoa> agrupar_geracao_Y(ArrayList<Pessoa> base_de_pessoas) {
        /*
         Retorna o subconjunto das pessoas da base que pertencem � Gera��o Y,
         de acordo com valores de ano m�nimo e m�ximo de nascimento definidos acima.
        */
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        for (int i = 0; i < base_de_pessoas.size(); i++) {
            Pessoa pessoa = base_de_pessoas.get(i);
            if (pessoa.nascida_entre(1981,1995)) {
                listaPessoas.add(pessoa);
            }
        }
        return listaPessoas;
    }

    public static ArrayList<Pessoa> agrupar_geracao_Z(ArrayList<Pessoa> base_de_pessoas) {
        /*
         Retorna o subconjunto das pessoas da base que pertencem � Gera��o Z,
         de acordo com valores de ano m�nimo e m�ximo de nascimento definidos acima.
        */
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        for (int i = 0; i < base_de_pessoas.size(); i++) {
            Pessoa pessoa = base_de_pessoas.get(i);
            if (pessoa.nascida_entre(1996,2012)) {
                listaPessoas.add(pessoa);
            }
        }
        return listaPessoas;
    }

q2

ublic String traduzir_para_portugues(String termo) {
        try {
            int k = localizar_ingles(termo);
            assert (k >= 0 && k < dicionario.size());

            Equivalencia eq = dicionario.get(k);
            return eq.para_portugues();
        } catch (AssertionError erro) {
            System.out.println("-- TERMO INGL�S DESCONHECIDO --");
            return "";
        }
    }

    public String traduzir_para_ingles(String termo) {
        try {
            int k = localizar_portugues(termo);
            assert (k >= 0 && k < dicionario.size());

            Equivalencia eq = dicionario.get(k);
            return eq.para_ingles();
        } catch (AssertionError erro) {
            System.out.println("-- TERMO PORTUGU�S DESCONHECIDO --");
            return "";
        }
    }
