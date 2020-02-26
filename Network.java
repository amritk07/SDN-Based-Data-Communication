package datacommunication;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Network {
	int nodes;
	//Node[] info;
	Map<Integer,List<Integer>> adjlist;
	Network(int nodes)
	{
		this.nodes = nodes;
		adjlist = new HashMap<>();
		//info = new Node[nodes];
	}
	void addVertex(int v)
	{
		adjlist.put(v,new LinkedList<Integer>());
	}
	void addEdge(int src, int des)
	{
		if(!adjlist.containsKey(src))
			addVertex(src);
		
		if(!adjlist.get(src).contains(des))
		adjlist.get(src).add(des);
		
		if(!adjlist.containsKey(des))
			addVertex(des);
		if(!adjlist.get(des).contains(src))
		adjlist.get(des).add(src);
		//info[src].name= src;
		//info[des].name=des;
	}
	void printList()
	{
		for(Map.Entry<Integer, List<Integer> > x: adjlist.entrySet())
		{
			System.out.print(x.getKey()+"->");
			List<Integer> list = x.getValue();
			for(int y : list)
			{
				System.out.print(" "+y+" ");
			}
			System.out.println();
		}
	}
}
