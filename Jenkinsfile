node{
	stage('git checkout'){
		git credentialsId: 'git-creds', url: 'https://github.com/pd-tcs/DevOps_Bootcamp.git'
	}
	
	stage('code build & test'){
		def mavenHome = tool name: 'maven-3', type: 'maven'
		def mavenCMD = "${mavenHome}/bin/mvn"
		sh "${mavenCMD} clean package"
	}

	stage('docker build'){
		sh 'docker build -t pdtcs/jdkimage:2.0 .'
	}

	stage('docker push'){
		withCredentials([string(credentialsId: 'dockerPwd', variable: 'dockerHubPwd')]) {
			sh "docker login -u pdtcs -p ${dockerHubPwd}"
		}
			sh 'docker push pdtcs/jdkimage:2.0'
	}

	stage('docker run'){
		sh 'docker run -p 8888:8082 -d pdtcs/jdkimage:2.0'
	}
}
