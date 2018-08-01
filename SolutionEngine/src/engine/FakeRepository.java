package engine;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;

import engine.query.Query;
import engine.solver.Solver;
import engine.solver.SolverFactory;

public class FakeRepository implements Repository {

	@Override
	public Query getQuery(int id) {
		Query retval = (id == 0) ? this.genFakeQuery(): null;
		return retval;
	}
	
	private Query genFakeQuery() {
		Hashtable<String,String> plist = new Hashtable<String,String>();
		plist.put("alpha", "String");
		plist.put("beta", "ServiceMode");
		Query retval = new Query(0,"fakequery","My favourite query",plist,"Boolean");
		return retval;
	}

	@Override
	public Solver getSolver(int qid) {
		URL fakeuri = null;
		try {
//			fakeuri = new URL("https://www.dropbox.com/s/zlyiyoazcj1jyp1/FakeSolver.jar");
			fakeuri = new URL("file:///home/stefano/Dropbox/workspace/java-oxygen/Surreal_Engine/run/FakeSolver.jar");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Solver retval = SolverFactory.generate(fakeuri);
		return retval;
	}
}