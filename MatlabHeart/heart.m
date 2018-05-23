function heart
while 1
method = menu('用不同的方式画心形','三维网格图','二维心形曲线','三维曲面(带光照效果)','退出');
switch method
    case 1,
        heart_1
    case 2,
        heart_2
    case 3,
        heart_3
    otherwise
        break;
end
end
function heart_1
figure(101)
step = 0.05;
[X Y Z] = meshgrid(-3:step:3, -3:step:3, -3:step:3);
F=((-(X.^2).*(Z.^3)-(9/80).*(Y.^2).*(Z.^3))+((X.^2)+(9/4).*(Y.^2)+(Z.^2)-1).^3);
p = patch(isosurface(X,Y,Z,F,0,Z));
set(p,'facecolor','none','EdgeColor','interp');
colormap(hsv)
daspect([1 1 1])
view(3)
axis tight
axis equal
axis off
function heart_2
% 二维心形图
figure(102)
ezplot('(x^2-1+y^2)^3-x^2*y^3')
axis([-2.5 2.5 -2 2])
function heart_3
% 三维心形图
figure(103)
n=100;
x=linspace(-3,3,n);
y=linspace(-3,3,n);
z=linspace(-3,3,n);
[X,Y,Z]=ndgrid(x,y,z);
F=((-(X.^2) .* (Z.^3) -(9/80).*(Y.^2).*(Z.^3)) + ((X.^2) + (9/4).* (Y.^2) + (Z.^2)-1).^3);
isosurface(F,0)
lighting phong
caxis;
axis equal
colormap('flag');
view([55 34]); 
axis off