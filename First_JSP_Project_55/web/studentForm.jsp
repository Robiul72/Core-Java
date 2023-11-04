
<%@include file="header.jsp" %>

<div class="container my-3">
    <div style="text-align: center">
        <div class="jumborton bg-success p-2"><h2 style="color: white">Registration Form</h2></div>
    </div>

    <!--    Form start-->
    <form class="" style="background-color: beige" action="addStudent.jsp" method="post">
        <!--    1st row start    -->
        <div class="row mt-3">
            <div class="col-md-6">
                <label><h4>First Name :</h4></label>
                <input type="text" class="form-control" name="firstName" placeholder="First Name">
            </div>

            <div class="col-md-6">
                <label><h4>Last Name :</h4></label>
                <input type="text" class="form-control" name="lastName" placeholder="Last Name">
            </div>
        </div>
        <!--    1st row End    --> 


        <!--    2rd row Start    --> 
        <div class="row mt-3">
            <div class="col-md-6">
                <label><h4>FatherFirstName :</h4></label>
                <input type="text" class="form-control" name="fatherFirstName" placeholder="Father's First Name">
            </div>

            <div class="col-md-6">
                <label><h4>FatherLastName :</h4></label>
                <input type="text" class="form-control" name="fatherLastName" placeholder="Father's Last Name">
            </div>
        </div>
        <!--    2rd row End    -->  
        
        <!--    3rd row Start    --> 
        <div class="row mt-3">
            <div class="col-md-6">
                <label><h4>MotherFirstName :</h4></label>
                <input type="text" class="form-control" name="motherFirstName" placeholder="Mother's First Name">
            </div>

            <div class="col-md-6">
                <label><h4>MotherLastName :</h4></label>
                <input type="text" class="form-control" name="motherLastName" placeholder="Mother's Last Name">
            </div>
        </div>
        <!--    3rd row End    --> 


        <!--    4rd row End    -->         
        <div class="row mt-3">
            <div class="col-md-2">
                <label><h4>Gender :</h4></label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="gender" id="flexRadioDafult1" value="male">
                    <label class="form-check-label" for="flexRadioDafult1">Male</label>
                </div>
            </div>

            <div class="col-md-4">
                <div class="form-check mt-4 p-2">
                    <input class="form-check-input" type="radio" name="gender" id="flexRadioDafult1" value="female">
                    <label class="form-check-label" for="flexRadioDafult1">Female</label>
                </div>
            </div>

            <div class="col-md-6">
                <label><h4>Date Of Birth :</h4></label>
                <input type="text" class="form-control" name="dateOfBirth" placeholder="DD/MM/YYYY">
            </div>
        </div>        
        <!-- 4rd row End    -->


        <!-- 5rd row Start    -->  
        <div class="row mt-3">
            <div class="col-md-6">
                <label><h4>NID NO :</h4></label>
                <input type="text" class="form-control" name="nid" placeholder="xxxxxx">
            </div>

            <div class="col-md-6">
                <label><h4>Contact NO :</h4></label>
                <input type="text" class="form-control" name="contact" placeholder="xxxxxx">
            </div>
        </div>      
        <!-- 5rd row End    --> 


        <!-- 6rd row Start    --> 
        <div class="row mt-3">
            <div class="col-md-6">
                <label><h4>Email NO :</h4></label>
                <input type="text" class="form-control" name="email" placeholder="robiul@email.com">
            </div>

            <div class="col-md-6">
                <label><h4>Entry Date :</h4></label>
                <input type="text" class="form-control" name="entryDate" placeholder="DD/MM/YYYY">
            </div>
        </div>
        <!-- 6rd row End    -->  


        <!-- 7rd row start    --> 
        <div class="row mt-2">
            <div class="col-md-12">
                <label><h4>Address :</h4></label>
                <div class="input-group mb-4">
                    <span class="input-group-text">@</span>
                    <div class="form-floating">
                        <input type="text" class="form-control" id="floatingInputGroup1" name="address" placeholder="Username">
                        <label for="floatingInputGroup1">Username</label>
                    </div>
                </div>
            </div>
        </div>
        <!-- 7rd row End    -->  

        <div class="row mt-3 text-center">
            <div class=" col-md-6">
                <button type="submit" class="btn bg-success text-center">Save</button>
            </div>
            
            <div class=" col-md-6">
                <button type="reset" class="btn bg-danger text-center">Reset</button>
            </div>
        </div>
    </form>
    <!--    Form End-->


</div>

<%@include file="footer.jsp" %>