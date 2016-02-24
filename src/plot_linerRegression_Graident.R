library(ggplot2);

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

#get data to plot 
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

#plot initial data 
point_plot<-function(data){
        point<-ggplot(data,aes(x,y))+geom_point()+geom_smooth();
}

#plot the change of theta
contour_plot<-function(theta){
        theta_1<-theta[1,1];
        theta_2<-theta[2,1];
        contour<-ggplot(data,aes(theta1,theta2,z=j_val))+geom_contour(aes(z=j_val),binwidth=1);
}

plot_linerRegression_Graident<-function(){
        print(require(ggplot2));
        data<-read.table('ex1data1.txt',sep=","); #read data from txt file
        X<-as.matrix(data[,1]);#get X matrix
        y<-as.matrix(data[,2]);# get y matrix
        X<-formulization(X);
        
       # initial_plot<-point_plot(data.frame(x=X,y=y));
        
        m<-nrow(X);
        #formalizate matrix X
       #add 1 to matrix X
        X<-as.matrix(cbind(rep(1,m),X))
       #initialize theta
        theta<-as.matrix(rep(0,2));
       #get the theta 
        theta<-gradient(X,y,m,theta,0.01);
       
        theta_1<-theta[1,1];
        theta_2<-theta[2,1];
       
       # plot contour
        x_axis<-seq(-1,1.5,length=50);
        y_axis<-seq(-1,1.5,length=50);
        z_axis<-matrix(rep(0,50*50),ncol=50,nrow=50);
        xy_axis<-matrix(nrow=50*50,ncol=3);
        sum<-1;
        for(i in 1:50){
                for(j in 1:50){
                    
                        xy_axis[sum,1]<-x_axis[i];
                        xy_axis[sum,2]<-y_axis[j];
                        xy_axis[sum,3]<-computeCost(X,y,m,as.matrix(c(x_axis[i],y_axis[j])));
                        z_axis[i,j]<-computeCost(X,y,m,as.matrix(c(x_axis[i],y_axis[j])));
                        sum<-sum+1;
                        
                       
                }
                
        }
        theta_jval<-data.frame(axis_x=xy_axis[,1],axis_y=xy_axis[,2],axis_z=log(xy_axis[,3]));
        contour<-ggplot(theta_jval,aes(axis_x,axis_y,z=axis_z))+
                 geom_contour()+
                 scale_x_continuous(limits=c(-10,10))+
                 scale_y_continuous(limits=c(-1,4));    
        #create persp
        plot2<-persp(x_axis,y_axis,z=z_axis ,theta = 135, phi = 30, col = "green3", scale = FALSE,
              ltheta = -120, shade = 0.75, border = NA, box = TRUE,xlab="theta_0",ylab="theta_1",zlab="J(theta)");
     #  points(trans3d(xy[,1], xy[,2], 6, pmat = plot2), col = 2, pch = 16)
        
        
        
        
        
        
       
        
      
        
}