<jsp:include page="Header.jsp"></jsp:include>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    
    
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
						<form action="emplois" method="get" modelAttribute="profs">
							<div class="form-group">
								<label>Profs</label>
											<select class="form-select form-control" name="filiere">
												<optgroup label="Filiere">
												    <option value="HE489751" ${cin eq 'HE489751' ? 'selected' : ''}>Zekrani</option>
												    <option value="H223153" ${cin eq 'HE489751' ? 'selected' : ''}>El faquih</option>
												    <option value="FR874521" ${cin eq 'HE489751' ? 'selected' : ''}>Chergui</option>
						
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