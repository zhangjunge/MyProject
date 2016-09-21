#get std
computeStd<-function(X){
        len<-ncol(X);
        std<-rep(0,len);
        for(i in 1:len){
                std[i]<-sd(X[,i])
        }
        return (as.matrix(std))
}

#normalization matrix X
formulization<-function(X){
        mu<-as.matrix(colMeans(X));
        std<-computeStd(X);
        X_norm<-X;
        for(i in 1:nrow(X)){
                X_norm[i,]<-(X[i,]-mu)/std;
                
        }
       
        return (X_norm);
}

gradient<-function(X,y,m,theta,alpha){
        for(i in 1:1500){
                theta<-theta-alpha*1/m*(t((t(X%*%theta-y))%*%X)); #compute theta using batch gradient algorithm
              #  cat(i," iteration:",theta,"\n")
        }
      
        return (theta);
}

computeCost<-function(X,y,m,theta){
        jval<-(1/(2*m))*(t(X%*%theta-y))%*%(X%*%theta-y);
        return(jval);
}
 
linerRegression_Graident<-function(){
        data<-read.table('ex1data2.txt',sep=","); #read data from txt file
        X<-data[,1:ncol(data)-1];#get X matrix
        X<-formulization(X);
        m<-nrow(X);
        #formalizate matrix X
        X<-as.matrix(cbind(rep(1,m),X)) #add 1 to matrix X
        y<-as.matrix(data[,ncol(data)]);# get y matrix
        theta<-as.matrix(rep(0,ncol(data))); #initialize theta
        value<-0;
        theta<-gradient(X,y,m,theta,0.01);
        
        value<-computeCost(X,y,m,theta);
        cat("1500 iteration value:",value,"\n");
        cat(" iteration:",theta,"\n")
        
}