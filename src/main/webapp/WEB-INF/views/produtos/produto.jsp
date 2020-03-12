<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<html>
	<%@ include file="../base/header.jsp"%>
	<body>
		<%@ include file="../base/navbar.jsp"%>
	
		<div class="container">			
			<br>			
			<f:form action="/v1/produtos" method="post" modelAttribute="produto">
				
				<div class="row">
					<div class="col s12">
						
						<div class="card">
							<div class="card-content">
								<span class="card-title center-align">Titulo</span>
							
								<div class="row">
									<div class="input-field col s12">
										<label>Descrição</label>
										<input name="descricao" id="descricao" type="text" class="validate"/>
									</div>
								</div>	
								
								<div class="row">
									<div class="input-field col s6">
									<label>Preço de Custo</label>
										<input name="custoUnitario" id="custoUnitario" type="text" type="number" min="0" class="validate"/>
									</div>
									
									<div class="input-field col s6">
									<label>Preço de Venda</label>
										<input name="precoVenda" id="precoVenda" type="text" type="number" min="0" class="validate"/>
									</div>						
								</div>
								
								<div class="row">
									<div class="input-field col s10">
										<label>Categoria</label>
										<input name="categoria" id="categoria" type="text" class="validate"/>
									</div>								
									
		
								</div>					
							
							</div>
							
							<div class="card-action">
								<input class="btn-small green" type="submit" value="Salvar">
							</div>						
						
						</div>					
					
					</div>
				</div>
			</f:form>
		</div>
	
		<%@ include file="../base/scripts.jsp"%>
		
	</body>
</html>
