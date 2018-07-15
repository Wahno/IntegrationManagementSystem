<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="grid_3 grid_4 w3_agileits_icons_page">
	<div class="icons">
		<h2 class="agileits-icons-title">控制台</h2>
		<section id="new">
			<div class="row fontawesome-icon-list">
				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i
						class="fa fa-asl-interpreting" aria-hidden="true"></i>
						fa-asl-interpreting <span class="text-muted">(alias)</span></a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i
						class="fa fa-assistive-listening-systems" aria-hidden="true"></i>
						fa-assistive-listening-systems</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i
						class="fa fa-audio-description" aria-hidden="true"></i>
						fa-audio-description</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-blind"
						aria-hidden="true"></i> fa-blind</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-braille"
						aria-hidden="true"></i> fa-braille</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-deaf"
						aria-hidden="true"></i> fa-deaf</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-deafness"
						aria-hidden="true"></i> deafness <span class="text-muted">(alias)</span></a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-envira"
						aria-hidden="true"></i> fa-envira</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-fa"
						aria-hidden="true"></i> fa-fa <span class="text-muted">(alias)</span></a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-first-order"
						aria-hidden="true"></i> fa-first-order</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-font-awesome"
						aria-hidden="true"></i> fa-font-awesome</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-gitlab"
						aria-hidden="true"></i> fa-gitlab</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-glide"
						aria-hidden="true"></i> fa-glide</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-glide-g"
						aria-hidden="true"></i> fa-glide-g</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i
						class="fa fa-google-plus-circle" aria-hidden="true"></i>
						fa-google-plus-circle <span class="text-muted">(alias)</span></a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i
						class="fa fa-google-plus-official" aria-hidden="true"></i>
						fa-google-plus-official</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-hard-of-hearing"
						aria-hidden="true"></i> fa-hard-of-hearing <span
						class="text-muted">(alias)</span></a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-instagram"
						aria-hidden="true"></i> fa-instagram</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-low-vision"
						aria-hidden="true"></i> fa-low-vision</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-pied-piper"
						aria-hidden="true"></i> fa-pied-piper</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i
						class="fa fa-question-circle-o" aria-hidden="true"></i>
						fa-question-circle-o</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-sign-language"
						aria-hidden="true"></i> fa-sign-language</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-signing"
						aria-hidden="true"></i> fa-signing <span class="text-muted">(alias)</span></a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-snapchat"
						aria-hidden="true"></i> fa-snapchat</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-snapchat-ghost"
						aria-hidden="true"></i> fa-snapchat-ghost</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-snapchat-square"
						aria-hidden="true"></i> fa-snapchat-square</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-themeisle"
						aria-hidden="true"></i> fa-themeisle</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i
						class="fa fa-universal-access" aria-hidden="true"></i>
						fa-universal-access</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-viadeo"
						aria-hidden="true"></i> fa-viadeo</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-viadeo-square"
						aria-hidden="true"></i> fa-viadeo-square</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i
						class="fa fa-volume-control-phone" aria-hidden="true"></i>
						fa-volume-control-phone</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-wheelchair-alt"
						aria-hidden="true"></i> fa-wheelchair-alt</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-wpbeginner"
						aria-hidden="true"></i> fa-wpbeginner</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-wpforms"
						aria-hidden="true"></i> fa-wpforms</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-yoast"
						aria-hidden="true"></i> fa-yoast</a>
				</div>

			</div>

		</section>
	</div>
</div>