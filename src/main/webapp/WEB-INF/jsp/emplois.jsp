<jsp:include page="Header.jsp"></jsp:include>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <div class="content">
        <div class="row">
          <div class="col-md-12">
            <div class="card">
              <div class="card-header">
              <div class="row">
              <div class="col-8"><h4 class="card-title"> Liste des emplois </h4></div>
              <div class="col-4"><a href="genererEmploi.jsp" class="btn btn-info">Generer un emplois</a></div>
               
              </div>
              
               <div class="row">
	               <div class="col pr-1">
						<form action="emplois" method="get">
							<div class="form-group">
								<label>Filière:</label>
								<select class="form-select form-control" name="filiere">
									<optgroup label="Filiere">
									    <option value="IAGI1" ${filiere eq 'IAGI1' ? 'selected' : ''}>IAGI 1</option>
									    <option value="IAGI2" ${filiere eq 'IAGI2' ? 'selected' : ''}>IAGI 2</option>
									    <option value="IAGI3" ${filiere eq 'IAGI3' ? 'selected' : ''}>IAGI 3</option>
									    <option value="GEM1" ${filiere eq 'GEM1' ? 'selected' : ''}>GEM 1</option>
									    <option value="GEM2" ${filiere eq 'GEM2' ? 'selected' : ''}>GEM 2</option>
									    <option value="GEM3" ${filiere eq 'GEM3' ? 'selected' : ''}>GEM 3</option>
									    <option value="MSEI1" ${filiere eq 'MSEI1' ? 'selected' : ''}>MSEI 1</option>
									    <option value="MSEI2" ${filiere eq 'MSEI2' ? 'selected' : ''}>MSEI 2</option>
									    <option value="MSEI3" ${filiere eq 'MSEI3' ? 'selected' : ''}>MSEI 3</option>
									</optgroup>
								</select>                
							</div>
			               	<input type="submit" value="Submit" class="btn btn-info"/>
			          	</form>
                  	</div>    
	              </div>
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
                        <c:forEach var="sea" items="${seancesL}">
	                        <c:if test="${sea.heurDeb == 1400}">
	                        <td></td>
	                        </c:if>
	                        <td>
	                        
	                        
	                          ${sea.matiere.name}
	                        </td>
						</c:forEach>
                      </tr>
                      
                      <tr>
                      
                        <td style="color:red">
                          Mardi
                        </td>
                        <c:forEach var="sea" items="${seancesM}">
	                        <c:if test="${sea.heurDeb == 1400}">
	                        <td></td>
	                        </c:if>
	                        <td>
	                        
	                        
	                          ${sea.matiere.name}
	                        </td>
						</c:forEach>
                      </tr>
                      
                      <tr>
                        <td style="color:red">
                          Mercredi
                        </td>
                        <c:forEach var="sea" items="${seancesMe}">
	                        <c:if test="${sea.heurDeb == 1400}">
	                        <td></td>
	                        </c:if>
	                        <td>
	                        
	                        
	                          ${sea.matiere.name}
	                        </td>
						</c:forEach>
                      </tr>
                      <tr>
                        <td style="color:red">
                          Jeudi
                        </td>
                        <c:forEach var="sea" items="${seancesJ}">
	                        <c:if test="${sea.heurDeb == 1400}">
	                        <td></td>
	                        	                     
	                        
	                        </c:if>
	                        <td>
	                        
	                        
	                          ${sea.matiere.name}
	                        </td>
						</c:forEach>
                      </tr>
                      <tr>
                        <td style="color:red">
                          Vendredi
                        </td>
                        <c:forEach var="sea" items="${seancesV}">
	                        <c:if test="${sea.heurDeb == 1400}">
	                        <td></td>
	                        </c:if>
	                        <td>
	                        
	                        
	                          ${sea.matiere.name}
	                        </td>
						</c:forEach>
                      </tr>


                    </tbody>
                  </table>
                </div>  
                                     <div class="text-center"><button class="btn btn-primary">Modifier</button></div> 
                   
              </div>
            </div>
            
          </div>
          
              </div>
            </div>

    
 
 <jsp:include page="footer.jsp"></jsp:include>