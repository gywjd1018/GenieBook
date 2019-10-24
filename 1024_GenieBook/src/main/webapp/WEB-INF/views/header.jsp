<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
	<!-- 상단 메뉴  -->
	<!-- Header Section Starts -->
		<header id="header-area">
		<!-- Header Top Starts -->
			<div class="header-top">
			<!-- Nested Container Starts -->
				<div class="container clearfix text-center text-sm-left">
				<!-- Top Links Starts -->
					<ul class="list-unstyled list-inline header-links mb-0 float-sm-right">
						<li class="list-inline-item"><a href="#"><i class="fa fa-home d-block d-lg-none" title="지니북"></i><span class="d-none d-lg-block">지니북</span></a></li>
						<!-- <li class="list-inline-item"><a href="#"><i class="fa fa-heart d-block d-lg-none" title="Wish List(0)"></i><span class="d-none d-lg-block">Wish List(0)</span></a></li> -->
						<li class="list-inline-item"><a href="showAdmin.do"><i class="fa fa-user d-block d-lg-none" title="마이페이지"></i><span class="d-none d-lg-block">마이페이지</span></a></li>
						<li class="list-inline-item"><a href="#"><i class="fa fa-shopping-cart d-block d-lg-none" title="장바구니"></i><span class="d-none d-lg-block">장바구니</span></a></li>
						<li class="list-inline-item"><a href="#"><i class="fa fa-crosshairs d-block d-lg-none" title="결제"></i><span class="d-none d-lg-block">결제</span></a></li>
						<li class="list-inline-item"><a href="register.do"><i class="fa fa-unlock d-block d-lg-none" title="회원가입"></i><span class="d-none d-lg-block">회원가입</span></a></li>
						<li class="list-inline-item"><a href="login.do"><i class="fa fa-lock d-block d-lg-none" title="로그인"></i><span class="d-none d-lg-block">로그인</span></a></li>
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
						<!-- 로고 -->
							<div class="col-xl-6 col-md-4 col-sm-12 text-center">
								<div id="logo"><a href="#"><img src="images/logo.png" title="지니북" alt="지니북" class="img-fluid" /></a></div>
							</div>
						<!-- 로고 end -->	
						
						<!-- 책 검색 Starts -->
							<div class="col-xl-3 col-md-4 col-sm-12">
								<div id="search">
									<div class="input-group">
									  <input type="text" class="form-control" placeholder="책검색하기">
									  <span class="input-group-btn">
										<button class="btn" type="button">
											<i class="fa fa-search"></i>
										</button>
									  </span>
									</div>
								</div>	
							</div>
						<!-- 책 검색 Ends -->
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
							<!-- 국내서적 start  -->
							<li class="nav-item dropdown">
								<a href="category-list.html" class="nav-link dropdown-toggle" data-toggle="dropdown">
									국내 서적
								</a>
								<div class="dropdown-menu rounded-0">
									<a href="#" class="dropdown-item">어린이</a>
									<a href="#" class="dropdown-item">청소년</a>
									<a href="#" class="dropdown-item">참고서</a>
									<a href="#" class="dropdown-item">소설/시/희곡</a> 
									<a href="#" class="dropdown-item">자기계발</a> 
									<a href="#" class="dropdown-item">사회/과학</a> 
									<a href="#" class="dropdown-item">컴퓨터/IT</a>  
								</div>
							</li>
							<!-- 국내서적 end  -->
							
							<!-- 외국서적 start -->
							<li class="nav-item dropdown">
								<a href="category-list.html" class="nav-link dropdown-toggle" data-toggle="dropdown">
									외국 서적
								</a>
								<div class="dropdown-menu rounded-0">
									<a href="#" class="dropdown-item">어린이</a>
									<a href="#" class="dropdown-item">청소년</a>
									<a href="#" class="dropdown-item">참고서</a>
									<a href="#" class="dropdown-item">소설/시/희곡</a> 
									<a href="#" class="dropdown-item">자기계발</a> 
									<a href="#" class="dropdown-item">사회/과학</a> 
									<a href="#" class="dropdown-item">컴퓨터/IT</a>  
								</div>
							</li>
							<!-- 외국서적 end -->
							
							<li class="nav-item"><a href="board.do" class="nav-link">공지사항</a></li>
							<li class="nav-item"><a href="board.do" class="nav-link">자유게시판</a></li>
							
							<!-- 페이지 직접 가기   -->
							<li class="nav-item dropdown">
								<a href="category-list.html" class="nav-link dropdown-toggle" data-toggle="dropdown">
									페이지 직접 가기 
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
							<!-- 페이지 직접 가기   -->
							
						</ul>
					</div>
				<!-- Navbar Cat collapse Ends -->
				
				</div>
			<!-- Nested Container Ends -->
			
			</nav>
		<!-- Main Menu Ends -->
		
		</header>
	<!-- Header Section Ends -->
	
	<!-- 상단 메뉴  -->