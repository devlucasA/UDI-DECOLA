package model;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pesquisa {
	
    private String origem;
    private String destino;
    private Data dat_inicial;
    private Data dataFim;
    private LocalDateTime dat_hora_pesquisa;
    private ArrayList<Hotel> hotel;
    private ArrayList<Voo> voos;
    
    public Pesquisa(ArrayList<Hotel> hoteis, String destino, Data dat_inicial, Data dataFim,
            LocalDateTime dat_hora_pesquisa) {
        // Inicializa a lista de hotéis
        this.hotel = new ArrayList<>();
        
        // A pesquisa vai retornar todo hotel que tenha a mesma cidade que destino.
        for(Hotel h : hoteis) {
            if(h.getCidade().equals(destino)) {
                this.hotel.add(h);
            }
        }
        this.origem = null; // Origem é definida como nula ou indefinida
        this.destino = destino;
        this.dat_inicial = dat_inicial;
        this.dataFim = dataFim;
        this.dat_hora_pesquisa = LocalDateTime.now();
    }
    
    public Pesquisa(ArrayList<Voo> voos, String origem, String destino, Data dat_inicial, Data dataFim,
            LocalDateTime dat_hora_pesquisa) {
        // Inicializa a lista de voos
        this.voos = new ArrayList<>();
        
        // Pesquisa de voos, a função retorna todos os voos tal que o último trecho de voo é igual ao destino
        for(Voo voo : voos) {
            Trecho_de_Voo aux = voo.getTrecho().get(0);
            
            if(aux.getDestino().equals(destino)) {
                this.voos.add(voo);
            }
        }
        
        this.origem = origem;
        this.destino = destino;
        this.dat_inicial = dat_inicial;
        this.dataFim = dataFim;
        this.dat_hora_pesquisa = LocalDateTime.now();
    }

    
    public void mostrarPesquisaHotel() {
        int i = 0;
        for (Hotel hotel_aux : hotel) {
        	/*
        	 * System.out.println("Índice: " + i++);
      			System.out.println(hotel_aux.getMsg_divulgacao());

        	 */
            
        }
    }
    
    public Hotel selecionarDaPesquisaHotel(int escolha) {
    	mostrarPesquisaHotel(); // esse metodo, dada uma escolha de indice ele retorna o elemento indexado.
    	if (escolha >= 0 && escolha < hotel.size())
    		return hotel.get(escolha);
    	return null;
    }
    
    public void mostrarPesquisaVoo() {
    	int i=0;
    	
        for (Voo voo : voos) {
        	
        	/*
	        	System.out.println("Índice: " + i++);
	            System.out.println("Origem: " + voo.getTrecho().getOrigem());
	            System.out.println("Destino: " + voo.getTrecho().getDestino());
	            System.out.println("Data: " + voo.getData());
	            System.out.println("Hora de partida: " + voo.getHora_programada_partida());
	            System.out.println("Hora de chegada: " + voo.getHora_programada_chegada());
	            System.out.println("Número de vagas disponíveis: " + voo.getNro_vagas_disponiveis());
	            System.out.println("Preço da passagem: " + voo.getPreco_da_passagem());
	            System.out.println("---------------------------------------------");
            */
        }
    }

    public Voo selecionarDaPesquisaVoo(int escolha) {
    	mostrarPesquisaVoo(); // esse metodo, dada uma escolha de indice ele retorna o elemento indexado.
    	if (escolha >= 0 && escolha < voos.size())
    		return voos.get(escolha);
    	return null;
    }
    
    
    
    // Gets e sets
	public String getOrigem() {
		return origem;
	}


	public void setOrigem(String origem) {
		this.origem = origem;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Data getDat_inicial() {
		return dat_inicial;
	}

	public void setDat_inicial(Data dat_inicial) {
		this.dat_inicial = dat_inicial;
	}

	public Data getDataFim() {
		return dataFim;
	}

	public void setDataFim(Data dataFim) {
		this.dataFim = dataFim;
	}

	public LocalDateTime getDat_hora_pesquisa() {
		return dat_hora_pesquisa;
	}


	public void setDat_hora_pesquisa(LocalDateTime dat_hora_pesquisa) {
		this.dat_hora_pesquisa = dat_hora_pesquisa;
	}

	//Getter e setter do Hotel e voos
	public ArrayList<Hotel> getHotel() {
		return hotel;
	}

	public void setHotel(ArrayList<Hotel> hotel) {
		this.hotel = hotel;
	}

	public ArrayList<Voo> getVoos() {
		return voos;
	}

	public void setVoos(ArrayList<Voo> voos) {
		this.voos = voos;
	}
    
	
    
    

}
