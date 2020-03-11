<!DOCTYPE html>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
	<%@ include file="base/header.jsp"%>

	<body>
		<div class="container"> 
			<div class="row">
				<div class="col s6 offset-s3">
					<div class="card">
						<div class="card-content">
							<span class="card-title">Entrar no Sistema</span>
							
							<f:form class="form-signin" action="${s:mvcUrl('loginUrl').build()}" method="POST" >
								<label for="inputUsername" class="sr-only">Login</label>
								<input id="inputUsername" name="username" placeholder="login" required autofocus>
								
								<label for="inputPassword" class="sr-only">Password</label>
								<input type="password" name="password" id="inputPassword" placeholder="senha" required>
								
						  		<button class="btn waves-effect waves-light black" type="submit">
						  			Entrar<i class="material-icons right">send</i>
						  		</button>
							</f:form>							
						</div>
					
					</div>
				 
				</div>			
			</div>
		</div>
	</body>	
	<%@ include file="base/scripts.jsp" %>
</html>