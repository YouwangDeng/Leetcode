# DataCamp Data Scientist with Python track
* Python
    * 5/2 = 2.5
    * 3 ** 2 = 9
    * type(x)
    * bool: True False
    * and not or
    * if elif else remember the : sign
    * while expression :
    * for elem in nums :
    * for i in range(10):
        * 0,1,2,...9
    * for i in range(1,11):
        * 1,2,3,..10
    * for i in range (1,11,3):
        * 1,4,7,10
    * enumerate
        * for index, elem in enumerate(nums, start = 0):
    * for c in string: 
        * iterate char by char
    * for k, v in my_dict.items():
    * for elem in np_array:
    * for elem in np.nditer(2D_np_array):
    * pandas for loop
        * for label, row in num.iterrows():
            * return a pandas series
        * use apply function
        * num['new_col'] = num['col1'].apply(func_name)
    * print("I started with $" + str(savings))
    * python list [a,b,c]
        * could contain different types
        * num[0], num[-1]
        * num[3:5] return 3 and 4
        * num[:3] return 0,1,2
        * nums[3:] return 3,4,5,...
        * add two list
        * delete element:del(elem)
        * num2 = num, just copy the reference
        * num2 = list(num) or num2 = num[:] will create a new list
    * fuctions
        * built in functions
            * max(list_a)
            * round(1.49,1) = 1.5 round(1.49) = 1
            * help(round) open the documentation of round()
            * len(list_a)
            * sorted(iterable, key=None, reverse=False)
            * num.index(elem)
            * num.count(elem)
            * s is a string, s.capitalize() return the first character capitalized string
            * s.replace('a','bc'), s.index('a')
            * but list do not have replace method
            * list_a.append(elem) list.remove(elem) remove the first element that matchs list.reverse()
            * s.upper() return all capitalized string
            * s.count('a')
        * packages
            * import numpy 
            * import numpy as np
            * from numpy import array
* NumPy
    * numeric python
    * alternative to python list: numpy array
    * numpy array can only contain single data type
    * num is a numpy array
    * num[1]
    * num > 10 return a bool array
    * num[num > 10] return the desired array, ps: use [] not ()
    * np.logical_and(num > 10, num < 20) return a bool array
    * np.logical_or() np.logical_not()
    * 2D numpy array: create with a list built with several lists
        * num_2d[0][1] or num_2d[0,1] num_2d[:,1:3]
        * num_2d.shape return the dimension of 2d array , ps no () 
        * np.mean(num_2d[:,0]) same with median
        * np.corrcoef(num_2d[:,0],num_2d[:,1])
        * np.std(num_2d[:,0])
        * np.sum(), np.sort()
    * np.random.rand()
    * np.random.seed(an_int)
        * use a seed, then the next random generation will return the same value
    * np.random.randint(start_inclusive, end_delusive)
* Matplotlib
    * import matplotlib.pyplot as plt
    * plt.plot(x,y) x and y both are one dimension array
    * plt.show()
    * plt.scatter(x, y) and plt.show() to get the scatter plot
    * plt.xscale('log') Put the x-axis on a logarithmic scale
    * Histogram: get idea about distribution
    * plt.hist(x, bins = 3), plt.show() bins are default as 10
    * plt.clf() clean the plot
    * plt.xlable('lable for x')
    * plt.ylable('lable for y')
    * plt.title('title for the plot')
    * plt.yticks([0,2,4,8],['0','2B','4B','8B'])
    * plt.scatter(x,y,s=z, c = col_dict, alpha = 0.8) customized the plot with size of each bubble, alpha stands for degree of transparent 
    * plt.text(xNum, yNum, 'string') add tags to the plot
    * plt.grid(True) make grid appears on the plot
* Dictionary
    * my_dict = { key:value, key: value}
    * my_dict.keys() to get an array of keys
    * my_dict['key'] to get the paired value
    * keys should be immutable values, list can't be keys
    * add key value pair just my_dict['key'] = value
    * check if one key is in dict, use key in my_dict, this will return a boolean
    * delete a pair in dict use del(my_dict['key'])
* Pandas
    * high level data manipulation tool
    * built on numpy
    * use a dict to organize data first, keys are column labels, values are data column by column
    * import pandas as pd
    * my_frame = pd.DataFrame(my_dict)
    * my_frame.index = [row labels,]
    * could also make a frame from csv files, csv stands for comma separated value
    * my_frame_2 = pd.read_csv("path/to/file.csv", index_col = 0)
    * use my_frame['col_name'] to get a column values, return a pandas series data type, not a frame, if use my_frame[['col_name']], would return a data frame
    * could use my_frame[['col_name1','col_name2']] to get multiply columns
    * could use my_frame[1:4] to get row 1,2,3 values
    * loc - label based
        * my_frame.loc[['row-label']]
        * my_frame.loc[['row-label1', 'row-label2']]  get row values
        * my_frame.loc[:,['col-label1', 'col-label2']]  get col values
        * my_frame.loc[['row-label1', 'row-label2'], ['col-label1', 'col-label2']] would return a intersection of this frame
    * iloc - integer position based
        * my_frame.iloc[[1]]
        * my_frame.iloc[[1,2,3]]
        * my_frame.iloc[[1,2,3],[0,1]]
        * my_frame.iloc[:,[0,1]]
    * filter pandas DataFrame
        * first num['area']get the column, ps: a pandas series not a frame
        * second is_huge = num['area'] > 8 compare the value
        * third num[is_huge]
        * with one line: num[num['area'] > 8]
        * use num[np.logical_and(num['area'] > 8, num['area'] < 10)]

        








