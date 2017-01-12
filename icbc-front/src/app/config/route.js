export default ($stateProvider, $urlRouterProvider, $locationProvider) => {
  'ngInject';

  $stateProvider

    //登陆
    // .state('app', {
    //   url: '/',
    //   abstract: true,
    //   templateUrl: 'app/auth/portal/portal.html',
    //   controller: 'portalCtrl'
    // })
    // 首页
    .state('in', {
      // abstract: true,
      url: '/',
      templateUrl: 'app/in/in.html', 
      controller: 'inCtrl'
    })
    .state('in.Act_certification', {
      url: '^/Act_certification',
      templateUrl: 'app/in/Act_certification/act.html',
      controller: 'ActCtrl'
    })
    .state('in.Device_fingerprinting', {
      url: '^/Device_fingerprinting',
      templateUrl: 'app/in/Device_fingerprinting/dev.html',
      controller: 'DevCtrl'
    })
    .state('in.Risk_monitoring', {
      url: '^/Risk_monitoring',
      templateUrl: 'app/in/Risk_monitoring/ris.html',
      controller: 'RisCtrl'
    })
    .state('in.Trust_relationships', {
      url: '^/Trust_relationships',
      templateUrl: 'app/in/Trust_relationships/tru.html',
      controller: 'TruCtrl'
    })
    .state('in.Trans_monitoring', {
      url: '^/Trans_monitoring',
      templateUrl: 'app/in/Trans_monitoring/tra.html',
      controller: 'TraCtrl'
    })
    ;
    

  $urlRouterProvider.otherwise('/');
};
