# Building Aria and ArNetworking
make Aria
cd ArNetworking
make ArNetworking
cd ..

# Create directories
sudo mkdir -p /usr/local/include/Aria/
sudo mkdir -p /usr/local/include/ArNetworking/

# Copy includes
sudo cp -r include/* /usr/local/include/Aria/
sudo cp -r ArNetworking/include/* /usr/local/include/ArNetworking/

# Copy lib
sudo cp lib/libAria.so /usr/local/lib/libAria.so
sudo cp lib/libArNetworking.so /usr/local/lib/libArNetworking.so