artifactory('8081') {
  security {
  users {
    user('name') {
      email 'login_1@jfrog.com'
      password 'passwd_1'
      admin false
      profileUpdatable false
      internalPasswordDisabled false
    }
  }

  groups {
    group('name') {
      description 'desc_1'
      autoJoin false
    }
  }

  permissions {
    permission('name') {
      includesPattern '**'
      excludesPattern ''
      anyLocal false
      anyRemote false
      anyDistribution false
      users {
        'name' (['delete', 'manage', 'annotate', 'read', 'deploy']) // value userA - is example. Please set existing user names from the instance 
      }
      groups {
        'name' (['delete', 'manage', 'annotate', 'read', 'deploy']) // value groupsG1 - is example. Please set existing group names from the instance 
      }
    }
  }

}
}