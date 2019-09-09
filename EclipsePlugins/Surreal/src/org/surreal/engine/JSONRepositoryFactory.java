package org.surreal.engine;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import org.surreal.engine.query.Query;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

public class JSONRepositoryFactory {
	
	public static JSONRepository generate(String urlname) {
		JSONRepository retval = null;
		try {
			JsonObject root = JSONRepositoryFactory.readFromURL(urlname);
			retval = JSONRepositoryFactory.parsingJSON(root);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return retval;
	}

	private static JSONRepository parsingJSON(JsonObject root) {
		JSONRepository retval = new JSONRepository();
		JsonArray array = root.get("queries").asArray();
		for (JsonValue temp: array) {
			Query query = new Query();
			JsonObject jsonQuery = temp.asObject();
			query.setId(jsonQuery.get("id").asString());
			query.setKind(jsonQuery.get("kind").asString());
			query.setName(jsonQuery.get("name").asString());
			query.setDescription(jsonQuery.get("description").asString());
			query.setResult(jsonQuery.get("result").asString());
			query.setSolver(jsonQuery.get("solver").asString());
			JsonValue jsonParamList = jsonQuery.get("paramlist");
			if (jsonParamList.isArray()) {
				for (JsonValue tempListElement: jsonParamList.asArray()) {
					JsonObject jsonQueryFormalBinding = tempListElement.asObject();
					String name = jsonQueryFormalBinding.get("name").asString();
					String type = jsonQueryFormalBinding.get("stereotype").asString();
					query.addParam(name,type);
				}
			}
			retval.addQuery(query);
		}
		return retval;
	}

	private static JsonObject readFromURL(String urlname) throws IOException {
		URL url = new URL(urlname);
		Reader reader = new InputStreamReader(url.openStream());
		String payload = JSONRepositoryFactory.readAll(reader);
		JsonObject root = Json.parse(payload).asObject();
		return root;
	}

	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}
}



//@SuppressWarnings("unchecked")
//Iterator<JSONObject> iterator = paramlist.iterator();
//while (iterator.hasNext()) {
//	JSONObject temp = iterator.next();
//	String paramname = (java.lang.String) temp.get("name");
//	String paramtype = (java.lang.String) temp.get("stereotype");
//	retval.addParam(paramname,paramtype);
//}



//try {
////JSONObject queryEntry = this.getSolverUriFromId(qid);
////solverURI = new URL((String) queryEntry.get("solver"));
//} catch (MalformedURLException e) {
//e.printStackTrace();
//System.out.println("REPOSITORY: cannot retrive solver URI for query " + qid);
//} catch (Exception e) {
//e.printStackTrace();
//System.out.println("REPOSITORY: cannot open repository");
//}

		

//private JSONObject getSolverUriFromId(String qid) throws Exception {
//JSONParser parser = new JSONParser();
//JSONObject retval = null;
//JSONObject jsonObject = (JSONObject) parser.parse(this.reader);
//JSONArray solverList = (JSONArray) jsonObject.get("Query");            
//@SuppressWarnings("unchecked")
//Iterator<JSONObject> iterator = solverList.iterator();
//while (iterator.hasNext()) {
//	JSONObject temp = iterator.next();
//	String idQuery = (String) temp.get("id");
//	if (idQuery.equals(qid)) {
//		retval = temp;
//	}
//}
//return retval;
//}

//
//}
//

	
//JSONObject retval = null;
//HttpClient httpclient = new DefaultHttpClient();
//HttpResponse response = httpclient.execute(httppost);
//    HttpEntity entity = response.getEntity();
//InputStream is = null;
//try {
//	
//	is = new URL(url).openStream();
//	JSONParser parser = new JSONParser();
//	BufferedReader rd = new BufferedReader(new InputStreamReader(is,Charset.forName("UTF-8")));
//	String jsonText = readAll(rd);
//	retval = (JSONObject) parser.parse(jsonText);
//} catch (ParseException e) {
//	e.printStackTrace();
//} catch (IOException e) {
//	e.printStackTrace();
//} finally {
//	if (is != null) {
//		try {
//			is.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}				
//	}
//}
//return retval;
