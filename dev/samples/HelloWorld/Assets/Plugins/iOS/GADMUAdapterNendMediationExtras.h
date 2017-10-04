//
//  GADMUAdapterNendExtras.h
//  
//  Created by F@N on 2017/10/02.
//

#import <Foundation/Foundation.h>
#import <GoogleMobileAds/GoogleMobileAds.h>

@interface GADMUAdapterNendMediationExtras : NSObject

- (id<GADAdNetworkExtras>)adNetworkExtrasWithDictionary:(NSDictionary<NSString *, NSString *> *)extras;

@end
