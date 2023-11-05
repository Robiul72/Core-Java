

<%@include file="header.jsp" %>

<div class="container my-3">
    <div class="bg-info text-center">
        <h1 class="jumborton">Student Form</h1>
    </div>
    
    <form action="addStudent.jsp" method="post" style="background-color: beige">
        
        <div class="row">
            <div class="col-md-6">
                <label class="form-label"> First Name :</label>
                <input type="text" class="form-control" id="firstName" name="firstName" placeholder="First Name">                
            </div>
            
            <div class="col-md-6">
                <label class="form-label"> Last Name :</label>
                <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Last Name">                
            </div>
            
            <div class="row mt-3 text-center">
                <div contenteditable="col-md-6">
                    <button type="submit" class="btn btn-success text-center"> Save </button> 
                </div>
                
                <div contenteditable="col-md-6">
                    <button type="reset" class="btn btn-danger text-center"> Reset </button> 
                </div>
            </div>
            
        </div>
        
    </form>
</div>

<%@include file="footer.jsp" %>