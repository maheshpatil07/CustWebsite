<%@ page language="java" contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ include file="CommonHeader.jsp" %>

<form action="Register" method="post" style="border:1px solid #ccc">

  <div class="product">
    <h1>Sign Up</h1>
    <p>Please enter product details.</p>
    <hr>
   
	<label for="text"><b>Product ID</b></label>
    <input type="text" placeholder="Enter Product ID" name="productId" required>
    
    <label for="text"><b>Product Name</b></label>
    <input type="text" placeholder="Enter Product Name" name="productName" required>
    
    <label for="text"><b>Price</b></label>
    <input type="text" placeholder="Enter Price" name="price" required>
	
	<label for="stock"><b>Stock</b></label>
    <input type="text" placeholder="Enter Stock" name="stock" required>
    
    <label for="category"><b>Category</b></label>
    <input type="text" placeholder="Enter Category" name="category" required>
	
	<label for="text"><b>Supplier</b></label>
    <input type="text" placeholder="Enter Supplier" name="supplier" required>
    
    <label for="prodDesc"><b>Product Description</b></label>
    <textarea name="prodDesc" cols="20" rows="5"></textarea>
    
    <div class="clearfix">
      <button type="reset" class="cancelbtn">Reset</button>
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>


</body>
</html>