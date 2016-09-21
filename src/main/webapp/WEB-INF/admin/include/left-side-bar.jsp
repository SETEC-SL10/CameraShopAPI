<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    <div class="user-panel">
			<div class="pull-left image">
				<img
					src="${pageContext.request.contextPath}/resources/img/admin/avatar.png"
					class="img-circle" alt="User Image">
			</div>
			<div class="pull-left info">
				<p>ADMIN</p>
				<p>AKD</p>

			</div>
		</div>
		
		
		<!-- search form -->
		<form action="#" method="get" class="sidebar-form">
			<div class="input-group">
				<input type="text" name="q" class="form-control"
					placeholder="Search..."> <span class="input-group-btn">
					<button type="submit" name="search" id="search-btn"
						class="btn btn-flat">
						<i class="fa fa-search"></i>
					</button>
				</span>
			</div>
		</form>
		<!-- /.search form --> <!-- sidebar menu: : style can be found in sidebar.less -->
		
		
		
		
		
		
		<ul class="sidebar-menu">
			<!-- <li class="header">MAIN NAVIGATION</li> -->
			
			<li class="treeview">
				<a href="dashboard">
					<i class="fa fa-dashboard"></i>
					<span>Dashboard</span>
				</a>
			</li>
			
			<li class="treeview">
				<a href="dashboard">
					<i class="fa fa-dashboard"></i>
					<span>Product</span>
				</a>
				
				<ul class="treeview-menu">
					<li><a href=""><i class="fa fa-circle-o"></i> Camera </a></li>
					<li><a href=""><i class="fa fa-circle-o"></i> Accessory</a></li>
				</ul>
				
			</li>
			
			<li class="treeview">
				<a href="#">
					<i class="fa fa-dashboard"></i>
					<span>Sale</span>
				</a>
			</li>
			
			<li class="treeview">
				<a href="#">
					<i class="fa fa-dashboard"></i>
					<span>Staff</span>
				</a>
			</li>
			
			<li class="treeview">
				<a href="#">
					<i class="fa fa-dashboard"></i>
					<span>Supplier</span>
				</a>
			</li>
			
			<li class="treeview">
				<a href="#">
					<i class="fa fa-dashboard"></i>
					<span>Customer</span>
				</a>
			</li>
			
			<li class="treeview">
				<a href="dashboard">
					<i class="fa fa-dashboard"></i>
					<span>Import</span>
				</a>
				
				<ul class="treeview-menu">
					<li><a href=""><i class="fa fa-circle-o"></i> Camera </a></li>
					<li><a href=""><i class="fa fa-circle-o"></i> Accessory</a></li>
				</ul>
				
			</li>
			
			<li class="treeview">
				<a href="#">
					<i class="fa fa-dashboard"></i>
					<span>Setting</span>
				</a>
			</li>

			
		</ul>
