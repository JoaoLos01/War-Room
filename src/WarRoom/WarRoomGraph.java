package WarRoom;

import java.util.*;

public class WarRoomGraph {
    private Map<Integer, List<Integer>> adjList;
    private List<Integer> minCover;

    public WarRoomGraph() {
        adjList = new HashMap<>();
        minCover = new ArrayList<>();
    }

    public void addEdge(int u, int v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    private boolean isCover(Set<Integer> currentCover) {
        for (int u : adjList.keySet()) {
            for (int v : adjList.get(u)) {
                if (!currentCover.contains(u) && !currentCover.contains(v)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void findMinVertexCover() {
        List<Integer> vertices = new ArrayList<>(adjList.keySet());
        int n = vertices.size();
        int minSize = n + 1;
        Set<Integer> bestCover = new HashSet<>();

        int totalSubsets = 1 << n;
        for (int i = 0; i < totalSubsets; i++) {
            Set<Integer> currentCover = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    currentCover.add(vertices.get(j));
                }
            }

            if (isCover(currentCover) && currentCover.size() < minSize) {
                minSize = currentCover.size();
                bestCover = new HashSet<>(currentCover);
            }
        }

        minCover = new ArrayList<>(bestCover);
        
        System.out.println("\n=== Resultados do War Room ===");
        System.out.println("Vértices escolhidos: " + minCover);
        System.out.println("Tamanho da cobertura: " + minCover.size());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WarRoomGraph graph = new WarRoomGraph();

        System.out.println("--- Sistema de Resposta a Incidentes (War Room) ---");
        System.out.print("Quantas conexões (arestas) a rede possui? ");
        int edges = scanner.nextInt();

        System.out.println("Digite as conexões (ex: 1 2, indicando conexão do dispositivo 1 ao 2):");
        for (int i = 0; i < edges; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.addEdge(u, v);
        }

        graph.findMinVertexCover();

        System.out.println("\n=== Análise de Complexidade ===");
        System.out.println("Por se tratar de um problema NP-Completo na Teoria da Complexidade Computacional, a busca exata implementada tem custo exponencial.");
        System.out.println("Complexidade de Tempo: O(2^V * E) - Explora todos os subconjuntos de vértices e verifica todas as arestas.");
        System.out.println("Complexidade de Espaço: O(V + E) - Utilizado para a estrutura de lista de adjacência que armazena a rede.");
        
        scanner.close();
    }
}