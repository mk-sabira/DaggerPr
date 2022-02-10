package com.sabira.dagger

import javax.inject.Inject

class GithubService @Inject constructor(
    private val githubApiBuilder: GitHubApiBuilder
) {

    private val githubApi: GitHubApi = githubApiBuilder.buildApi()

    fun fetchRepos(username: String) { // call api }
    }

}