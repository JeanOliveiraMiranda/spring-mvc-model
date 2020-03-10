<nav>
	<div class="nav-wrapper grey darken-3">
		<a href="#" class="brand-logo">Gestão Estoque</a> 
		<a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
		<ul class="right hide-on-med-and-down">
	        <li><a href="#">Fornecedores</a></li>
	        <li><a href="#">Produtos</a></li>
	      	<!-- 
	      	<sec:authorize access="!isAuthenticated()">
	      		<li><a href="#">Entrar</a></li>
	      	</sec:authorize>
	      	
	      	<sec:authorize access="isAuthenticated()">
	      		<sec:authentication property="principal" var="user"/>
	      		
				<ul id="dropUsuario" class="dropdown-content">
					<li><a href="#">Detalhes</a></li>
					<sec:authorize access="hasRole('ROLE_ADMIN')" >
						<li role="separator" class="divider"></li>
						<li><a href="#">Perfis de Acesso</a></li>
						<li><a href="#">Usuários</a></li>
					</sec:authorize>
					<li class="divider"></li>
					<li><a href="${pageContext.request.contextPath}/logout">Sair</a></li>					
				</ul>
				
				<li><a class="dropdown-trigger" href="#!" data-target="dropUsuario">${user.nomeCompleto}<i class="material-icons right">arrow_drop_down</i></a></li>	      		
	      	
	      	</sec:authorize>
	      	 -->	
		</ul>
	</div>
</nav>

<ul class="sidenav" id="mobile-demo">
	<li><a href="#">Fornecedores</a></li>
	<li><a href="#">Produtos</a></li>
	    
	<!--   	
	<sec:authorize access="!isAuthenticated()">
		<li><a href="#">Entrar</a></li>
	</sec:authorize>
	
	<sec:authorize access="isAuthenticated()">
		<sec:authentication property="principal" var="user"/>
		
		
		<sec:authorize access="hasRole('ROLE_ADMIN')" >
			<li role="separator" class="divider"></li>
			<li><a href="#">${user.nomeCompleto}</a></li>
			<li><a href="#">Perfis de Acesso</a></li>
			<li><a href="#">Usuários</a></li>
		</sec:authorize>
		
		<li class="divider"></li>
		<li><a href="${pageContext.request.contextPath}/logout">Sair</a></li>	
	</sec:authorize>
	
	 -->
	
	
		
</ul>