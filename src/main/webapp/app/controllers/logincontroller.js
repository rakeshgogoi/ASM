app.controller('LoginController', function ($rootScope, $scope, $http, Auth) {
    $scope.loginPage = 'default';
    if(window.location.hostname == 'meratask.fieldrun.in')
        $scope.loginPage = 'meratask';
    $scope.login = function () {
        var formData = {
            email: $scope.email,
            password: $scope.password
        };

        $scope.dataLoading = true;
        Auth.login(formData,
            authSuccess,
            function (res) {
                console.log(res);
                $scope.error = res.message;
                $scope.dataLoading = false;
            }
        );

        function authSuccess(res) {
            $rootScope.$state.go("app.dashboard");
            $scope.dataLoading = false;
        }
    };

});