<jsp:include page="Header.jsp"></jsp:include>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
      <div class="content">
        <div class="row">
          <div class="col-md-8">
            <div class="card">
              <div class="card-header">
                <h5 class="title">Generer un emploi</h5>
              </div>
              <div class="card-body">
                <form>
                  
                    <div class="row">
                <div class="col pr-1">
                      <div class="form-group">
                        <label>Choisissez la filière:</label>
						<select class="form-select form-control" name="filiere">
                                        <optgroup label="Filiere">
                                            <option value="IAGI1">IAGI 1</option>
                                            <option value="IAGI2">IAGI 2</option>
                                            <option value="IAGI3">IAGI 3</option>
                                            <option value="GEM1">GEM 1</option>
                                            <option value="GEM2">GEM 2</option>
                                            <option value="GEM3">GEM 3</option>
                                            <option value="MSEI1">MSEI 1</option>
                                            <option value="MSEI2">MSEI 2</option>
                                            <option value="MSEI3">MSEI 3</option>
                                        </optgroup>
                                    </select>                      
                     </div>
                    </div>    
               
               </div>
                  <button class="btn btn-primary d-block btn-user w-100">Générer</button>
                </form>
              </div>
              
               <div class="card-body">
                <div class="table-responsive">
                  <table class="table">
                    <thead class="text-primary">
                      <th></th>
                      <th>
                        8h00-10h00
                      </th>
                      <th>
                        10h15-12h15
                      </th>
                      <th></th>
                      <th>
                        14h00-16h00
                      </th>
                      <th>
                        16h15-18h15
                      </th>
                      <th></th>
                    </thead>
                    <tbody>
                      
                        <tr>
                        <td style="color:red">
                          Lundi
                        </td>
                        <td>
                          Matiere 1
                        </td>
                        <td>
                          Matiere 2
                        </td>
                        <td>                         
                        </td>
                        <td>
                        Matiere 3
                    	</td>
                    	<td>
                    	Matiere 4
                    	</td>
                      </tr>
                      <tr>
                        <td style="color:red">
                          Mardi
                        </td>
                        <td>
                          Matiere 1
                        </td>
                        <td>
                          Matiere 2
                        </td>
                        <td>                         
                        </td>
                        <td>
                        Matiere 3
                    	</td>
                    	<td>
                    	Matiere 4
                    	</td>
                      </tr>
                      <tr>
                        <td style="color:red">
                          Mercredi
                        </td>
                        <td>
                          Matiere 1
                        </td>
                        <td>
                          Matiere 2
                        </td>
                        <td>                         
                        </td>
                        <td>
                        Matiere 3
                    	</td>
                    	<td>
                    	Matiere 4
                    	</td>
                      </tr>
                      <tr>
                        <td style="color:red">
                          Jeudi
                        </td>
                        <td>
                          Matiere 1
                        </td>
                        <td>
                          Matiere 2
                        </td>
                        <td>                         
                        </td>
                        <td>
                        Matiere 3
                    	</td>
                    	<td>
                    	Matiere 4
                    	</td>
                      </tr>
                      <tr>
                        <td style="color:red">
                          Vendredi
                        </td>
                        <td>
                          Matiere 1
                        </td>
                        <td>
                          Matiere 2
                        </td>
                        <td>                         
                        </td>
                        <td>
                        Matiere 3
                    	</td>
                    	<td>
                    	Matiere 4
                    	</td>
                      </tr>


                    </tbody>
                  </table>
                </div>  
              
            </div>
          </div>
          </div>
          </div>
        
 <jsp:include page="footer.jsp"></jsp:include>