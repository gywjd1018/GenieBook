<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
	<!-- ��� �޴�  -->
	<!-- Header Section Starts -->
		<header id="header-area">
		<!-- Header Top Starts -->
			<div class="header-top">
			<!-- Nested Container Starts -->
				<div class="container clearfix text-center text-sm-left">
				<!-- Top Links Starts -->
					<ul class="list-unstyled list-inline header-links mb-0 float-sm-right">
						<li class="list-inline-item"><a href="#"><i class="fa fa-home d-block d-lg-none" title="���Ϻ�"></i><span class="d-none d-lg-block">���Ϻ�</span></a></li>
						<!-- <li class="list-inline-item"><a href="#"><i class="fa fa-heart d-block d-lg-none" title="Wish List(0)"></i><span class="d-none d-lg-block">Wish List(0)</span></a></li> -->
						<li class="list-inline-item"><a href="showAdmin.do"><i class="fa fa-user d-block d-lg-none" title="����������"></i><span class="d-none d-lg-block">����������</span></a></li>
						<li class="list-inline-item"><a href="#"><i class="fa fa-shopping-cart d-block d-lg-none" title="��ٱ���"></i><span class="d-none d-lg-block">��ٱ���</span></a></li>
						<li class="list-inline-item"><a href="#"><i class="fa fa-crosshairs d-block d-lg-none" title="����"></i><span class="d-none d-lg-block">����</span></a></li>
						<li class="list-inline-item"><a href="register.do"><i class="fa fa-unlock d-block d-lg-none" title="ȸ������"></i><span class="d-none d-lg-block">ȸ������</span></a></li>
						<li class="list-inline-item"><a href="login.do"><i class="fa fa-lock d-block d-lg-none" title="�α���"></i><span class="d-none d-lg-block">�α���</span></a></li>
					</ul>
				<!-- Top Links Ends -->
				</div>
			<!-- Nested Container Ends -->
			</div>
		<!-- Header Top Ends -->
		
		<!-- Main Header Starts -->
			<div class="main-header">
			
			<!-- Nested Container Starts -->
				<div class="container">
				
				<!-- Nested Row Starts -->
					<div class="row">
						<!-- �ΰ� -->
							<div class="col-xl-6 col-md-4 col-sm-12 text-center">
								<div id="logo"><a href="#"><img src="images/logo.png" title="���Ϻ�" alt="���Ϻ�" class="img-fluid" /></a></div>
							</div>
						<!-- �ΰ� end -->	
						
						<!-- å �˻� Starts -->
							<div class="col-xl-3 col-md-4 col-sm-12">
								<div id="search">
									<div class="input-group">
									  <input type="text" class="form-control" placeholder="å�˻��ϱ�">
									  <span class="input-group-btn">
										<button class="btn" type="button">
											<i class="fa fa-search"></i>
										</button>
									  </span>
									</div>
								</div>	
							</div>
						<!-- å �˻� Ends -->
					</div>
				<!-- Nested Row Ends -->
				
				</div>
			<!-- Nested Container Ends -->
			
			</div>
		<!-- Main Header Ends -->
		
		<!-- Main Menu Starts -->
			<nav id="main-menu" class=" navbar navbar-expand-md rounded-0">
			
			<!-- Nested Container Starts -->
				<div class="container">
				
				<!-- Navbar Toggler Starts -->
					<button class="navbar-toggler ml-auto" type="button" data-toggle="collapse" data-target=".navbar-cat-collapse" aria-controls=".navbar-cat-collapse" aria-expanded="false" aria-badge="Toggle navigation">
						<span class="navbar-toggler-icon fa fa-bars"></span>
					</button>
				<!-- Navbar Toggler Ends -->
				
				<!-- Navbar Cat collapse Starts -->
					<div class="collapse navbar-collapse navbar-cat-collapse">
						<ul class="nav navbar-nav">
							<!-- �������� start  -->
							<li class="nav-item dropdown">
								<a href="category-list.html" class="nav-link dropdown-toggle" data-toggle="dropdown">
									���� ����
								</a>
								<div class="dropdown-menu rounded-0">
									<a href="#" class="dropdown-item">���</a>
									<a href="#" class="dropdown-item">û�ҳ�</a>
									<a href="#" class="dropdown-item">����</a>
									<a href="#" class="dropdown-item">�Ҽ�/��/���</a> 
									<a href="#" class="dropdown-item">�ڱ���</a> 
									<a href="#" class="dropdown-item">��ȸ/����</a> 
									<a href="#" class="dropdown-item">��ǻ��/IT</a>  
								</div>
							</li>
							<!-- �������� end  -->
							
							<!-- �ܱ����� start -->
							<li class="nav-item dropdown">
								<a href="category-list.html" class="nav-link dropdown-toggle" data-toggle="dropdown">
									�ܱ� ����
								</a>
								<div class="dropdown-menu rounded-0">
									<a href="#" class="dropdown-item">���</a>
									<a href="#" class="dropdown-item">û�ҳ�</a>
									<a href="#" class="dropdown-item">����</a>
									<a href="#" class="dropdown-item">�Ҽ�/��/���</a> 
									<a href="#" class="dropdown-item">�ڱ���</a> 
									<a href="#" class="dropdown-item">��ȸ/����</a> 
									<a href="#" class="dropdown-item">��ǻ��/IT</a>  
								</div>
							</li>
							<!-- �ܱ����� end -->
							
							<li class="nav-item"><a href="board.do" class="nav-link">��������</a></li>
							<li class="nav-item"><a href="board.do" class="nav-link">�����Խ���</a></li>
							
							<!-- ������ ���� ����   -->
							<li class="nav-item dropdown">
								<a href="category-list.html" class="nav-link dropdown-toggle" data-toggle="dropdown">
									������ ���� ���� 
								</a>
								<div class="dropdown-menu rounded-0">
									<a href="home.jsp" class="dropdown-item">Home</a>
									<a href="about.html" class="dropdown-item">About</a>
									<a href="category-list.html" class="dropdown-item">Category List</a>
									<a href="category-grid.html" class="dropdown-item">Category Grid</a>
									<a href="product.html" class="dropdown-item">Product</a>
									<a href="product-full.html" class="dropdown-item">Product Full Width</a>
									<a href="cart.html" class="dropdown-item">Cart</a>
									<a href="login.html" class="dropdown-item">Login</a>
									<a href="compare.html" class="dropdown-item">Compare Products</a>
									<a href="typography.html" class="dropdown-item">Typography</a>
									<a href="register.html" class="dropdown-item">Register</a>
									<a href="contact.html" class="dropdown-item">Contact</a>
									<a href="404.html" class="dropdown-item">404</a>
								</div>
							</li>
							<!-- ������ ���� ����   -->
							
						</ul>
					</div>
				<!-- Navbar Cat collapse Ends -->
				
				</div>
			<!-- Nested Container Ends -->
			
			</nav>
		<!-- Main Menu Ends -->
		
		</header>
	<!-- Header Section Ends -->
	
	<!-- ��� �޴�  -->