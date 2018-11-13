package org.surreal.engine;

import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.surreal.engine.query.Query;
import org.surreal.engine.solver.Solver;
import org.surreal.engine.solver.SolverFactory;

public class TrueFalseFakeRepository implements Repository {
	
	private static final String SOLVERS_PATH= "run\\solvers.json";
	
	@Override
	public Query getQuery(int qid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Solver getSolver(int qid) {
		URL solverURI = null;
		try {
			solverURI = new URL("file://" + getSolverUriFromId(qid));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println("REPOSITORY: cannot retrive solver URI for query " + qid);
		}
		return SolverFactory.generate(solverURI);
	}
	
	private String getSolverUriFromId(int qid) {
		JSONParser parser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(SOLVERS_PATH));
            JSONArray solverList = (JSONArray) jsonObject.get("Solver List");            
            @SuppressWarnings("unchecked")
			Iterator<JSONObject> iterator = solverList.iterator();
            while (iterator.hasNext()) {
            	JSONObject solver = iterator.next();
            	int idQuery = Integer.parseInt((String) solver.get("id Query"));
            	if (idQuery==qid)
            		return (String) solver.get("jar");
            }
        } catch (Exception e) {
            System.out.println("REPOSITORY: cannot parse config file!");
        }
        //default solver
        return null;
	}

}